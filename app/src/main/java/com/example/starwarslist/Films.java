package com.example.starwarslist;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Films {
    String title;
    int episode_id;
    String opening_crawl;
    String director;
    String producer;
    String release_date;

    public Films(JSONObject jsonObject) throws JSONException {
        title = jsonObject.getString("title");
        episode_id = jsonObject.getInt("episode_id");
        opening_crawl = jsonObject.getString("opening_crawl");
        director = jsonObject.getString("director");
        producer = jsonObject.getString("producer");
        release_date = jsonObject.getString("release_date");
    }

    public static List<Films> fromJsonArray(JSONArray filmsJsonArray) throws JSONException {
        List<Films> films = new ArrayList<Films>();
        for (int i=0; i < filmsJsonArray.length(); i++)
            films.add(new Films(filmsJsonArray.getJSONObject(i)));

        return films;
    }

    @Override
    public String toString(){
        return title + "\n"
                + "Episode: " + episode_id + "\n"
                + "Director: " + director + "\n"
                + "Producer: " + producer + "\n"
                + "Release date: " + release_date + "\n"
                + "Opening crawl: " + opening_crawl;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getRelease_date() {
        return release_date;
    }
}
