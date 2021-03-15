package com.example.starwarslist;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codepath.asynchttpclient.AsyncHttpClient;
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Headers;

public class PlanetsActivity extends AppCompatActivity {
    public static final String TAG = "PlanetsActivity";
    String url = "https://www.swapi.tech/api/planets";

    List<Planets> planets;

    RecyclerView rvList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        rvList = findViewById(R.id.rvList);
        final PlanetsAdapter adapter = new PlanetsAdapter(planets);
        rvList.setAdapter(adapter);
        rvList.setLayoutManager(new LinearLayoutManager(this));

        planets = new ArrayList<Planets>();

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Headers headers, JSON json) {
                Log.d(TAG, json.toString());
                Log.d(TAG, json.jsonArray.toString());
                try {
                    planets.addAll(Planets.fromJsonArray(json.jsonArray));
                  //  Log.d(TAG, "Size: ", planets.size());
                    adapter.notifyDataSetChanged();
                } catch (JSONException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Headers headers, String response, Throwable throwable) {
                Log.e(TAG, "Error Response", throwable);
            }
        });
    }
}
