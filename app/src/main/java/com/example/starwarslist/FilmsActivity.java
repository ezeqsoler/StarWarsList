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

public class FilmsActivity extends AppCompatActivity {
    public static final String TAG = "FilmsActivity";
    String url = "https://www.swapi.tech/api/films";

    List<Films> films;

    RecyclerView rvList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);

        rvList = findViewById(R.id.rvList);
        final FilmsAdapter adapter = new FilmsAdapter(films);
        rvList.setAdapter(adapter);
        rvList.setLayoutManager(new LinearLayoutManager(this));


        films = new ArrayList<Films>();

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Headers headers, JSON json) {
                Log.d(TAG, json.toString());
                Log.d(TAG, json.jsonArray.toString());
                try {
                    films.addAll(Films.fromJsonArray(json.jsonArray));
                    Log.d(TAG, "Size: " + films.size());
                    adapter.notifyDataSetChanged();
            } catch (JSONException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int i, Headers headers, String s, Throwable throwable) {
                Log.e(TAG, "Error Response", throwable);
            }
        });
    }
}
