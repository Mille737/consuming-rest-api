package com.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {
/*
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/greeting")
    public Weather greeting(@RequestParam(required=false, defaultValue="World") String name) {
        return new Weather(new Coord(), new Weather_());
    }*/
    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("weatherInfo", weatherService.see());

        return "index";
    }

    @GetMapping("/Create")
    public String create(){

        return "Create";
    }

    @PostMapping("/Create")
    public String create (@ModelAttribute Weather weather){
        weatherService.create(weather);
        return "redirect:/";
    }


}
