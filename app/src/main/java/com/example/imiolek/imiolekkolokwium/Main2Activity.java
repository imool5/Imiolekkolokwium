package com.example.imiolek.imiolekkolokwium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Lekarz> coffees = new ArrayList<>();
        coffees.add(new Lekarz("Karol Szyluk", "Ortopeda"));
        coffees.add(new Lekarz("Daniel Imiołek", "Chirurg"));
        coffees.add(new Lekarz("Aleksandra Kowalska", "Pediatra"));
        coffees.add(new Lekarz("Robert Wieszołek", "Kardiolog"));
    }
}
