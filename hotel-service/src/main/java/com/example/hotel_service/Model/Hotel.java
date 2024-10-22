package com.example.hotel_service.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Hotel {

    private Long id_hotel;
    private String name;
    private int stars;
    private Long id_city;

}
