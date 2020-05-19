package com.example.it2019testretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView dataText;
    private SwipeRefreshLayout swipe;
    private APIService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataText = findViewById(R.id.data_text);
        swipe = findViewById(R.id.swipe);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIConfig.HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(APIService.class);

        loadData("RU");

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData("RU");
            }
        });
    }

    private void loadData(String country) {
        swipe.setRefreshing(true);

        Call<DataResponse> call = service.getData(country);
        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                if (response.body() != null)
                    dataText.setText(response.body().countryData.get(0).toString());
                swipe.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                Snackbar.make(dataText, "Что-то сломалось.... :(((", Snackbar.LENGTH_LONG)
                        .show();
                swipe.setRefreshing(false);
            }
        });
    }
}
