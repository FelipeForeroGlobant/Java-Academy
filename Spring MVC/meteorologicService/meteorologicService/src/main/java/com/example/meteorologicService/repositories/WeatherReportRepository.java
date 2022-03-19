package com.example.meteorologicService.repositories;


import com.example.meteorologicService.entities.WeatherReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherReportRepository extends JpaRepository<WeatherReport, Long> {

}
