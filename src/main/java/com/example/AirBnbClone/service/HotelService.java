package com.example.AirBnbClone.service;

import com.example.AirBnbClone.dto.HotelDto;
import com.example.AirBnbClone.entity.Hotel;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

}
