package com.example.it2019testretrofit;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.it2019testretrofit.databinding.ActivityMainBinding;
import com.example.it2019testretrofit.model.DataCountry;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends MvpAppCompatActivity implements IMainView {


    @InjectPresenter
    public MainPresenter presenter;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = (ActivityMainBinding) DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        binding.setPresenter(presenter);
        presenter.loadData();
    }


    @Override
    public void loading() {
    }

    @Override
    public void success(DataCountry data) {
    }

    @Override
    public void error() {
        Snackbar.make(binding.getRoot(), "Что-то сломалось.... :(((", Snackbar.LENGTH_LONG)
                .show();
    }
}
