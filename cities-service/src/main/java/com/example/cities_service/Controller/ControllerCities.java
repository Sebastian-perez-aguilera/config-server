package com.example.cities_service.Controller;

import com.example.cities_service.Dto.DtoCity;
import com.example.cities_service.Service.IServiceCities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class ControllerCities {

    @Autowired
    IServiceCities serviCity;

    @GetMapping("/get")
    public DtoCity GetHotelsByIdCities(@RequestParam String name,
                                                       @RequestParam String country){

         DtoCity city = serviCity.getHotelByCityId(name,country);

     return city;



    }
}


