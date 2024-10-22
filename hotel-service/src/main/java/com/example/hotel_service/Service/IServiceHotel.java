package com.example.hotel_service.Service;

import com.example.hotel_service.Model.Hotel;

import java.util.List;

public interface IServiceHotel {


    public List<Hotel> gethotelbycityid(Long id_city);

    public void LoadHotels();
}
