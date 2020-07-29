package com.example.it2019testretrofit.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataCountry {

    @SerializedName("info")
    @Expose(deserialize = false, serialize = false)
    public JsonObject info;

    @SerializedName("total_cases")
    public int totalCases;

    @SerializedName("total_recovered")
    public int totalRecovered;

    @SerializedName("total_unresolved")
    public int totalUnresolved;

    @SerializedName("total_deaths")
    public int totalDeaths;

    @SerializedName("total_new_cases_today")
    public int totalNewCasesToday;

    @SerializedName("total_new_deaths_today")
    public int totalNewDeathsToday;

    @SerializedName("total_active_cases")
    public int totalActiveCases;

    @SerializedName("total_serious_cases")
    public int totalSeriousCases;

    @SerializedName("total_danger_rank")
    public int totalDangerRank;


    @Override
    public String toString() {
        return "Всего заражено: " + totalCases +
                "\nВсего выздоровело: " + totalRecovered +
                "\nНовые случие за сутки: " + totalNewCasesToday +
                "\nБолеют сейчас: " + totalActiveCases +
                "\nУровень опасности: " + totalDangerRank;
    }
}