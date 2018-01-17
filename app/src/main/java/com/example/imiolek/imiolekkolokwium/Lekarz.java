package com.example.imiolek.imiolekkolokwium;

/**
 * Created by Daniel on 17.01.2018.
 */

public class Lekarz {

    private String name;
    private String specialization;

    public Lekarz(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
