package com.example.meteorologicService.service;


import com.example.meteorologicService.entities.WeatherReportDTO;

import java.util.Collection;

public interface IWeatherReportService {

    public void createWeatherReport(WeatherReportDTO pac);

    public Collection<WeatherReportDTO> getAll();

    public void deleteWeatherReport(Long id);


}
