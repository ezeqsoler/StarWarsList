package com.example.starwarslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFilms;
    Button btnPeople;
    Button btnPlanets;
    Button btnSpecies;
    Button btnStarships;
    Button btnVehicles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFilms = findViewById(R.id.btnFilms);
        btnPeople = findViewById(R.id.btnPeople);
        btnPlanets = findViewById(R.id.btnPlanets);
        btnSpecies = findViewById(R.id.btnSpecies);
        btnStarships = findViewById(R.id.btnStarships);
        btnVehicles = findViewById(R.id.btnVehicles);
    }

    public void btnFilms_onClick(View view) {
        Intent i = new Intent(MainActivity.this, FilmsAdapter.class);
        startActivity(i);
    }

    public void btnPeople_onClick(View view) {
        Intent i = new Intent(MainActivity.this, PeopleAdapter.class);
        startActivity(i);
    }

    public void btnPlanet_onClick(View view) {
        Intent i = new Intent(MainActivity.this, PlanetsAdapter.class);
        startActivity(i);
    }

    public void btnSpecies_onClick(View view) {
        Intent i = new Intent(MainActivity.this, SpeciesAdapter.class);
        startActivity(i);
    }

    public void btnStarships_onClick(View view) {
        Intent i = new Intent(MainActivity.this, StarshipsAdapter.class);
        startActivity(i);
    }

    public void btnVehicle_onClick(View view) {
        Intent i = new Intent(MainActivity.this, VehiclesAdapter.class);
        startActivity(i);
    }
}