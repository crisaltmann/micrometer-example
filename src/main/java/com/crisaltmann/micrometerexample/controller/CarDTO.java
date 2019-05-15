package com.crisaltmann.micrometerexample.controller;

public class CarDTO {

    private String name;
    private Integer year;

    public CarDTO() {
    }

    public CarDTO(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
