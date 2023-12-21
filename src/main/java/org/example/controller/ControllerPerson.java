package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.ServicePerson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ControllerPerson {
    private final ServicePerson service;
    @GetMapping("/persons/by-city")
    @ResponseBody
    public List getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
