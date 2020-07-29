package com.example.it2019testretrofit;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableList;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.it2019testretrofit.API.APIConfig;
import com.example.it2019testretrofit.API.APIService;
import com.example.it2019testretrofit.API.APIServiceConstructor;
import com.example.it2019testretrofit.API.model.DataResponse;
import com.example.it2019testretrofit.model.DataCountry;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@InjectViewState
public class MainPresenter extends MvpPresenter<IMainView> {

    public ObservableList<DataCountry> dataCountry = new ObservableArrayList<>();
    public ObservableBoolean isLoading = new ObservableBoolean();

    public void loadData() {
        isLoading.set(true);
        APIService service = APIServiceConstructor.CreateService(APIService.class);
        Call<DataResponse> call = service.getData(APIConfig.COUNTRY);
        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                if (response.body() != null) {
                    dataCountry.clear();
                    dataCountry.addAll(response.body().getCountryData());
                    isLoading.set(false);
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                isLoading.set(false);
                getViewState().error();
            }
        });
    }

}
