package com.journals.longdom.ui.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.journals.longdom.model.HomeResponse;
import com.journals.longdom.network.JournalRepository;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> toastMessageObserver ;
    private MutableLiveData<Boolean> progressbarObservable;
    private MutableLiveData<HomeResponse> mutableLiveData;


    public void init(String page, Context context){
        if (mutableLiveData != null){
            return;
        }
        JournalRepository journalRepository = JournalRepository.getInstance(context);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("page",page);
        mutableLiveData = journalRepository.getHomeData(jsonObject);
        progressbarObservable = journalRepository.getProgressbarObservable();
        toastMessageObserver = journalRepository.getToastObserver();



    }

    public LiveData<HomeResponse> getHomeRepository() {
        return mutableLiveData;
    }

    public LiveData<String> getToastObserver(){
        return toastMessageObserver;
    }

    public MutableLiveData<Boolean> getProgressbarObservable() {
        return progressbarObservable;
    }


}