package com.example.starwarslist;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class People {
    String name;
    String birth_year;
    String eye_color;
    String gender;
    String hair_color;
    String height;
    String mass;
    String skin_color;

    public People(JSONObject jsonObject) throws JSONException {
        name = jsonObject.getString("name");
        birth_year = jsonObject.getString("birth_year");
        eye_color = jsonObject.getString("eye_color");
        gender = jsonObject.getString("gender");
        hair_color = jsonObject.getString("hair_color");
        height = jsonObject.getString("height");
        mass = jsonObject.getString("mass");
        skin_color = jsonObject.getString("skin_color");
    }

    public static List<People> fromJsonArray(JSONArray peopleJsonArray) throws JSONException {
        List<People> people = new ArrayList<People>();
        for (int i=0; i < peopleJsonArray.length(); i++)
            people.add(new People(peopleJsonArray.getJSONObject(i)));

        return people;
    }

    @Override
    public String toString(){
        return name + "\n"
                + "Birth Year: " + birth_year +"\n"
                + "Eye Color: " + eye_color
                + "Gender: " + gender + "\n"
                + "Hair Color: " + hair_color +"\n"
                + "Height: " + height + "\n"
                + "Mass: " + mass + "\n"
                + "Skin Color: " + skin_color + " \n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }
}
