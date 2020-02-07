package com.example.demo.controller;

import com.example.demo.model.VehicleDetails;
import com.example.demo.service.VehicleVinService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleVIN {

    @Autowired
    VehicleVinService vehicleVinService;

    @PostMapping(value = "/getDetails", produces = "application/json")
    public List<VehicleDetails> getDetails(@RequestParam(name = "inputValue")String inputValue) throws JsonProcessingException {
//        System.out.println("inputValue" + inputValue);
        return vehicleVinService.serviceMethod(inputValue);
    }
}
