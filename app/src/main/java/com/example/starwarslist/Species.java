package com.example.starwarslist;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Species {
    String name;
    String classification;
    String designation;
    String average_height;
    String average_lifespan;
    String eye_colors;
    String hair_colors;
    String skin_colors;
    String language;

    public Species(JSONObject jsonObject) throws JSONException {
        name = jsonObject.getString("name");
        classification = jsonObject.getString("classification");
        designation = jsonObject.getString("designation");
        average_height = jsonObject.getString("average_height");
        average_lifespan = jsonObject.getString("average_lifespan");
        eye_colors = jsonObject.getString("eye_colors");
        hair_colors = jsonObject.getString("hair_colors");
        skin_colors = jsonObject.getString("skin_colors");
        language = jsonObject.getString("language");

    }

    public static List<Species> fromJsonArray(JSONArray speciesJsonArray) throws JSONException {
        List<Species> species = new ArrayList<Species>();
        for (int i=0; i < speciesJsonArray.length(); i++)
            species.add(new Species(speciesJsonArray.getJSONObject(i)));

        return species;
    }

    @Override
    public String toString()
    {
        return name + "\n"
                + "Classification: " + classification + "\n"
                + "Designation: " + designation + "\n"
                + "Average Height: " + average_height + "\n"
                + "Average Lifespan: " + average_lifespan + "\n"
                + "Eye Colors: " + eye_colors + "\n"
                + "Hair Colors: " + hair_colors + "\n"
                + "Skin Colors: " + skin_colors + "\n"
                + "Language: " + language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverage_height() {
        return average_height;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
