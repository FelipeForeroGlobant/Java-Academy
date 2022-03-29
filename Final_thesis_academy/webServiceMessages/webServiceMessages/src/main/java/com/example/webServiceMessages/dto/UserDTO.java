package com.example.webServiceMessages.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;

@Getter
@Setter
public class UserDTO {

    private long id;
    private String name;
    private String LastName;
    private String dni;
    private String address;
    private String zipCodeCity;
    private String state;
    private String country;
    private String userName;
    private String password;
}
