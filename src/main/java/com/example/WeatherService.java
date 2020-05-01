package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepoJPA weatherRepoJPA;

    //se
    public List<Weather> see(){

        return weatherRepoJPA.findAll();
    }

    //create
    public void create(Weather weather){
        weatherRepoJPA.save(weather);
    }
}
