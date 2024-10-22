package com.example.cities_service.Repository;
import com.example.cities_service.Dto.DtoHotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name ="hotel-service")
public interface ApiHotel {

    @GetMapping("/Hotel/{id_city}")
    public List<DtoHotel>  getHotelsByIds(@PathVariable ("id_city") Long id_city);
}
