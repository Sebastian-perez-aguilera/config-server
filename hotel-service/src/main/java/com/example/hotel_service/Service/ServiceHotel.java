package com.example.hotel_service.Service;

import com.example.hotel_service.Model.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceHotel implements IServiceHotel{

    List<Hotel> hotelList = new ArrayList<>();

    @Override

    public List<Hotel> gethotelbycityid(Long id_city) {

        List<Hotel> getallhotels  = new ArrayList<>();

        this.LoadHotels();

        for(Hotel h:hotelList){
            if(h.getId_city() == id_city){
                getallhotels.add(h);
            }
        }



        return getallhotels;
    }

    @Override
    public void LoadHotels() {
        hotelList.add(new Hotel(1L,"Paradise",5,1L));
        hotelList.add(new Hotel(2L,"Fiesta Americana",5,2L));
        hotelList.add(new Hotel(3L,"HolidayIn",4,2L));
        hotelList.add(new Hotel(4L,"California",4,1L));
        hotelList.add(new Hotel(4L,"Scorpion",5,3L));

    }
}
