package com.example.AirBnbClone.dto;

import com.example.AirBnbClone.entity.ContactInfo;
import lombok.Data;

@Data
public class HotelDto {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private ContactInfo contactInfo;
    private Boolean active;
}
