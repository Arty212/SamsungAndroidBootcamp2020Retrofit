package com.example.it2019testretrofit.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataCountry {

    @SerializedName("info")
    @Expose(deserialize = false, serialize = false)
    private JsonObject info;

    @SerializedName("total_cases")
    private int totalCases;

    @SerializedName("total_recovered")
    private int totalRecovered;

    @SerializedName("total_unresolved")
    private int totalUnresolved;

    @SerializedName("total_deaths")
    private int totalDeaths;

    @SerializedName("total_new_cases_today")
    private int totalNewCasesToday;

    @SerializedName("total_new_deaths_today")
    private int totalNewDeathsToday;

    @SerializedName("total_active_cases")
    private int totalActiveCases;

    @SerializedName("total_serious_cases")
    private int totalSeriousCases;

    @SerializedName("total_danger_rank")
    private int totalDangerRank;

    public JsonObject getInfo() {
        return info;
    }

    public void setInfo(JsonObject info) {
        this.info = info;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public int getTotalUnresolved() {
        return totalUnresolved;
    }

    public void setTotalUnresolved(int totalUnresolved) {
        this.totalUnresolved = totalUnresolved;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getTotalNewCasesToday() {
        return totalNewCasesToday;
    }

    public void setTotalNewCasesToday(int totalNewCasesToday) {
        this.totalNewCasesToday = totalNewCasesToday;
    }

    public int getTotalNewDeathsToday() {
        return totalNewDeathsToday;
    }

    public void setTotalNewDeathsToday(int totalNewDeathsToday) {
        this.totalNewDeathsToday = totalNewDeathsToday;
    }

    public int getTotalActiveCases() {
        return totalActiveCases;
    }

    public void setTotalActiveCases(int totalActiveCases) {
        this.totalActiveCases = totalActiveCases;
    }

    public int getTotalSeriousCases() {
        return totalSeriousCases;
    }

    public void setTotalSeriousCases(int totalSeriousCases) {
        this.totalSeriousCases = totalSeriousCases;
    }

    public int getTotalDangerRank() {
        return totalDangerRank;
    }

    public void setTotalDangerRank(int totalDangerRank) {
        this.totalDangerRank = totalDangerRank;
    }

    @Override
    public String toString() {
        return "Всего заражено: " + totalCases +
                "\nВсего выздоровело: " + totalRecovered +
                "\nНовые случие за сутки: " + totalNewCasesToday +
                "\nБолеют сейчас: " + totalActiveCases +
                "\nУровень опасности: " + totalDangerRank;
    }
}