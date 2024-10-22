package com.example.cities_service.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class DtoHotel {
    private Long id_hotel;
    private String name;
    private int stars;
    private Long id_city;

}
