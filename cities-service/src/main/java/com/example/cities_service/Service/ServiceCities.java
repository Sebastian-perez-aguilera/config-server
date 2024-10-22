package com.example.cities_service.Service;

import com.example.cities_service.Dto.DtoCity;
import com.example.cities_service.Model.cities;
import com.example.cities_service.Repository.ApiHotel;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCities implements IServiceCities {

    @Autowired
    ApiHotel Api;

    List<cities> citiesList = new ArrayList<cities>();



    @Override
    public void LoadCities() {
        citiesList.add(new cities(1L, "CDMX", "Americano", "Mexico", "DF"));
        citiesList.add(new cities(2L, "Tokio", "Asiatico", "Japon", "Tokio"));
        citiesList.add(new cities(3L, "Rio de janeiro", "Amerrica", "Brasil", "San paulo"));


    }

    private cities findCity(String name,String country) {

     this.LoadCities();
        for (cities c : citiesList) {
            if (c.getName().equals(name)) {
                if (c.getCountry().equals(country)) {
                    return c;
                }
            }
        }
        return null;
    }


    @Override
    @CircuitBreaker(name= "hotel-service", fallbackMethod = "FallbackGetHotelsByCity")
    @Retry(name= "hotel-service")
    public DtoCity getHotelByCityId(String name,String country) {
        cities city = this.findCity(name,country);



        DtoCity citydto = new DtoCity();

        citydto.setId_city(city.getId_city());
        citydto.setName(city.getName());
        citydto.setCountry(city.getCountry());
        citydto.setContinent(city.getContinent());
        citydto.setState(city.getState());

        citydto.setDtoHotels(Api.getHotelsByIds(city.getId_city()));



        return citydto;
    }

    public DtoCity FallbackGetHotelsByCity(Throwable throwable) {
        System.out.println("Fallback method called due to: " + throwable.getMessage());
        return new DtoCity(0L, "Error", "Error", "Error", "Error", null);
    }

    public void createExeption(){

        throw  new IllegalArgumentException("Test Resilience and Circuit breaker");
    }

}

