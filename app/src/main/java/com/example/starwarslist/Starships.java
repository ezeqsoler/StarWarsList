package com.example.starwarslist;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Starships {
    String name;
    String model;
    String starship_class;
    String manufacturer;
    String cost_in_credits;
    String length;
    String crew;
    String passengers;
    String max_atmosphering_speed;
    String hyperdrive_rating;
    String MGLT;
    String cargo_capacity;
    String consumables;

    public Starships(JSONObject jsonObject) throws JSONException {
        name = jsonObject.getString("name");
        model = jsonObject.getString("model");
        starship_class = jsonObject.getString("starship_class");
        manufacturer = jsonObject.getString("manufacturer");
        cost_in_credits = jsonObject.getString("cost_in_credits");
        length = jsonObject.getString("length");
        crew = jsonObject.getString("crew");
        passengers = jsonObject.getString("passengers");
        max_atmosphering_speed = jsonObject.getString("max_atmosphering_speed");
        hyperdrive_rating = jsonObject.getString("hyperdrive_rating");
        MGLT = jsonObject.getString("MGLT");
        cargo_capacity = jsonObject.getString("cargo_capacity");
        consumables = jsonObject.getString("consumables");
    }

    public static List<Starships> fromJsonArray(JSONArray starshipsJsonArray) throws JSONException {
        List<Starships> starships = new ArrayList<Starships>();
        for (int i=0; i < starshipsJsonArray.length(); i++)
            starships.add(new Starships(starshipsJsonArray.getJSONObject(i)));

        return starships;
    }

    @Override
    public String toString() {
        return name + "\n"
                + "Model: " + model + "\n"
                + "Classification: " + starship_class + "\n"
                + "Manufacturer: " + manufacturer + "\n"
                + "Cost(galactic credits): " + cost_in_credits + "\n"
                + "Length: " + length + "\n"
                + "Crew: " + crew + "\n"
                + "Passengers: " + passengers + "\n"
                + "Max atmosphering speed: " + max_atmosphering_speed + "\n"
                + "Hyperdrive rating: " + hyperdrive_rating + "\n"
                + "MGLT(max speed in megalights/hour): " + MGLT + "\n"
                + "Cargo capacity(kg): " + cargo_capacity + "\n"
                + "Consumables: " + consumables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }
}
