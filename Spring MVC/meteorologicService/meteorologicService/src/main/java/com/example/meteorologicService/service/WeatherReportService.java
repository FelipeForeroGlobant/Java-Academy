package com.example.meteorologicService.service;


import com.example.meteorologicService.entities.WeatherReport;
import com.example.meteorologicService.entities.WeatherReportDTO;
import com.example.meteorologicService.repositories.WeatherReportRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WeatherReportService implements IWeatherReportService{

    @Autowired
    WeatherReportRepository weatherReportRepository;

    @Autowired
    ObjectMapper mapper;


    public void createWeatherReport(WeatherReportDTO pac)
    {
        WeatherReport weatherReport = mapper.convertValue(pac, WeatherReport.class);
        weatherReportRepository.save(weatherReport);
    }


    public Collection<WeatherReportDTO> getAll() {
        List<WeatherReport> weatherReports= weatherReportRepository.findAll();
        Set<WeatherReportDTO> weatherReportsDTO = new HashSet<>();
        for (WeatherReport weatherReport : weatherReports) {
            WeatherReportDTO weatherReportDTO = new WeatherReportDTO();

            weatherReportDTO.setId(weatherReport.getId());
            weatherReportDTO.setDate(weatherReport.getDate());
            weatherReportDTO.setLongitude(weatherReport.getLongitude());
            weatherReportDTO.setCity(weatherReport.getCity());
            weatherReportDTO.setState(weatherReport.getState());
            weatherReportDTO.setTemperature1(weatherReport.getTemperature1());
            weatherReportDTO.setTemperature2(weatherReport.getTemperature2());
            weatherReportDTO.setTemperature3(weatherReport.getTemperature3());
            weatherReportDTO.setTemperature4(weatherReport.getTemperature4());


            weatherReportsDTO.add(weatherReportDTO);
        }
        return weatherReportsDTO;
    }

    public void deleteWeatherReport(Long id) {
        weatherReportRepository.deleteById(id);
    }

}
