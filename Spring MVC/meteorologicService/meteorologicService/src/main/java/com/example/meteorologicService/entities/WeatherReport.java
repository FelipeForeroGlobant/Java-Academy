package com.example.meteorologicService.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;


@Entity
@Getter @Setter
public class WeatherReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;
    private String longitude;
    private String latitude;
    private String city;
    private String state;
    private Double temperature1;
    private Double temperature2;
    private Double temperature3;
    private Double temperature4;
}
