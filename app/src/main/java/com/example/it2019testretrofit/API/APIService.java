package com.example.it2019testretrofit.API;

import com.example.it2019testretrofit.API.model.DataResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("free-api")
    Call<DataResponse> getData(@Query("countryTotal") String country);

}
