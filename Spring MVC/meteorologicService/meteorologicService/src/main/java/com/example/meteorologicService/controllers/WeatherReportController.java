package com.example.meteorologicService.controllers;


import com.example.meteorologicService.entities.WeatherReportDTO;
import com.example.meteorologicService.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/weatherreports")
public class WeatherReportController {

    @Autowired
    private WeatherReportService weatherReportService;

    @PostMapping
    public ResponseEntity<?> addWeatherReport(@RequestBody WeatherReportDTO weatherReportDTO)
    {
        weatherReportService.createWeatherReport(weatherReportDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWeatherReport(@PathVariable long id){
        weatherReportService.deleteWeatherReport(id);
        return ResponseEntity.status(HttpStatus.OK).body("eliminado");
    }


    @GetMapping("/list")
    public Collection<WeatherReportDTO> listWeatherReports()
    {
        return weatherReportService.getAll();
    }



}
