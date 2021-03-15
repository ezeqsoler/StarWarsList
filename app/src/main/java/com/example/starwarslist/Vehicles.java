package com.example.starwarslist;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Vehicles {
    String name;
    String model;
    String vehicle_class;
    String manufacturer;
    String length;
    String cost_in_credits;
    String crew;
    String passengers;
    String max_atmosphering_speed;
    String cargo_capacity;
    String consumables;

    public Vehicles(JSONObject jsonObject) throws JSONException {
        name = jsonObject.getString("name");
        model = jsonObject.getString("model");
        vehicle_class = jsonObject.getString("starship_class");
        manufacturer = jsonObject.getString("manufacturer");
        length = jsonObject.getString("length");
        cost_in_credits = jsonObject.getString("cost_in_credits");
        crew = jsonObject.getString("crew");
        passengers = jsonObject.getString("passengers");
        max_atmosphering_speed = jsonObject.getString("max_atmosphering_speed");
        cargo_capacity = jsonObject.getString("cargo_capacity");
        consumables = jsonObject.getString("consumables");
    }

    public static List<Vehicles> fromJsonArray(JSONArray vehiclesJsonArray) throws JSONException {
        List<Vehicles> vehicles = new ArrayList<Vehicles>();
        for (int i=0; i < vehiclesJsonArray.length(); i++)
            vehicles.add(new Vehicles(vehiclesJsonArray.getJSONObject(i)));

        return vehicles;
    }

    @Override
    public String toString()
    {
        return name + "\n"
                + "Model: " + model + "\n"
                + "Class: " + vehicle_class + "\n"
                + "Manufacturer: " + manufacturer + "\n"
                + "Cost: " + cost_in_credits + "\n"
                + "Length: " + length + "\n"
                + "Crew: " + crew + "\n"
                + "Passengers: " + passengers + "\n"
                + "Max atmosphering speed: " + max_atmosphering_speed + "\n"
                + "Cargo capacity(kg): " + cargo_capacity + "\n"
                + "Consumables: " + consumables;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getVehicle_class() {
        return vehicle_class;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getLength() {
        return length;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public String getCrew() {
        return crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }
}
