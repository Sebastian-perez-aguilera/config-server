package com.example.cities_service.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class DtoCity {

        private Long id_city;
        private String name;
        private String continent;
        private String country;
        private String state;
        private List<DtoHotel> dtoHotels;


    }
