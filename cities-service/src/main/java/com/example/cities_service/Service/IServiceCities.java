package com.example.cities_service.Service;

import com.example.cities_service.Dto.DtoCity;

public interface IServiceCities {

    DtoCity getHotelByCityId(String name, String country);

    public void LoadCities ();

}