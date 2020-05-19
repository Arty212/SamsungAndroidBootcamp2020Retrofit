package com.example.it2019testretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("free-api")
    Call<DataResponse> getData(@Query("countryTotal") String country);

}
