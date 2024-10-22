package com.example.cities_service.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class cities {
    private Long id_city;
    private String name;
    private String continent;
    private String country;
    private String state;

}
