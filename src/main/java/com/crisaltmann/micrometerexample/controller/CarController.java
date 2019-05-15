package com.crisaltmann.micrometerexample.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/cars")
public class CarController {

    @GetMapping
    public ResponseEntity<List<CarDTO>> getCars() {
        return ResponseEntity.ok(Arrays.asList(
                new CarDTO("FORD - KA", 2019),
                new CarDTO("VW - GOL", 2016)));
    }

}
