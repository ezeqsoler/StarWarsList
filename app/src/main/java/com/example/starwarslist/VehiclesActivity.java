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

public class VehiclesActivity extends AppCompatActivity {
    public static final String TAG = "VehiclesActivity";
    String url = "https://www.swapi.tech/api/vehicles";

    List<Vehicles> vehicles;

    RecyclerView rvList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);

        rvList = findViewById(R.id.rvList);
        final VehiclesAdapter adapter = new VehiclesAdapter(vehicles);
        rvList.setAdapter(adapter);
        rvList.setLayoutManager(new LinearLayoutManager(this));

        vehicles = new ArrayList<Vehicles>();

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Headers headers, JSON json) {
                Log.d(TAG, json.toString());
                Log.d(TAG, json.jsonArray.toString());
                try {
                    vehicles.addAll(Vehicles.fromJsonArray(json.jsonArray));
                    // Log.d(TAG, "Size: ", starships.size());
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
