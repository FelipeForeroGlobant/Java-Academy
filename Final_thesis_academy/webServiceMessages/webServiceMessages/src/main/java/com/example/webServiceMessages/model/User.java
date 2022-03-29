package com.example.webServiceMessages.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter
@Entity
@Table(name="employees")
public class User {

    @Id
    @GeneratedValue
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
