package com.example.it2019testretrofit.API.model;

import com.example.it2019testretrofit.model.DataCountry;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {
    @SerializedName("countrydata")
    private List<DataCountry> countryData;
    @SerializedName("stat")
    private String stat;

    public List<DataCountry> getCountryData() {
        return countryData;
    }

    public void setCountryData(List<DataCountry> countryData) {
        this.countryData = countryData;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}