package com.example.it2019testretrofit.API.model;

import com.example.it2019testretrofit.model.DataCountry;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {
    @SerializedName("countrydata")
    public List<DataCountry> countryData;
    @SerializedName("stat")
    public String stat;
}