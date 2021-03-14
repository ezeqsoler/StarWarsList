package com.example.starwarslist;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Planets {
    String name;
    String diameter;
    String rotation_period;
    String orbital_period;
    String gravity;
    String population;
    String climate;
    String terrain;
    String surface_water;


    public Planets(JSONObject jsonObject) throws JSONException{
        name = jsonObject.getString("name");
        diameter = jsonObject.getString("diameter");
        rotation_period = jsonObject.getString("rotation_period");
        orbital_period = jsonObject.getString("orbital_period");
        gravity = jsonObject.getString("gravity");
        population = jsonObject.getString("population");
        climate = jsonObject.getString("climate");
        terrain = jsonObject.getString("terrain");
        surface_water = jsonObject.getString("surface_water");

    }

    public static List<Planets> fromJsonArray(JSONArray planetsJsonArray) throws JSONException {
        List<Planets> planets = new ArrayList<Planets>();
        for (int i=0; i < planetsJsonArray.length(); i++)
            planets.add(new Planets(planetsJsonArray.getJSONObject(i)));

        return planets;
    }

    @Override
    public String toString() {
        return name + "\n"
                + "Diameter: " + diameter + "\n"
                + "Rotation Period: " + rotation_period + "\n"
                + "Orbital Period: " + orbital_period + "\n"
                + "Gravity: " + gravity +"\n"
                + "Population: " + population + "\n"
                + "Climate: " + climate + "\n"
                + "Terrain: " + terrain + "\n"
                + "Water Surface: " + surface_water;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }
}
