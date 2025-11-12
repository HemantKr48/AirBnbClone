package com.example.AirBnbClone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ContactInfo {

    private String address;

    private String location;

    private String email;

    private String phone;
}
