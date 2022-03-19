package com.example.meteorologicService.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class WeatherReportDTO {
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
