package com.example.hotel_service.Controller;


import com.example.hotel_service.Model.Hotel;
import com.example.hotel_service.Service.IServiceHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Hotel")
public class ControllerHotel {

    @Autowired
    IServiceHotel serviceHotel;

    @GetMapping("/{id_city}")
    public List<Hotel> getHotelsByIds(@PathVariable Long id_city){
        return serviceHotel.gethotelbycityid(id_city);

    }
}
