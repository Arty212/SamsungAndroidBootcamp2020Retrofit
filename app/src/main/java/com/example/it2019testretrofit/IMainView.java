package com.example.it2019testretrofit;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.example.it2019testretrofit.model.DataCountry;

public interface IMainView extends MvpView {
    void loading();

    void success(DataCountry data);

    @StateStrategyType(value = OneExecutionStateStrategy.class)
    void error();
}
