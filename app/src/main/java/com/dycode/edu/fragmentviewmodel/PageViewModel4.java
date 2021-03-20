package com.dycode.edu.fragmentviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel4 extends ViewModel {
    private final MutableLiveData<String> mName = new MutableLiveData<>();

    public LiveData<String> getName() {
        return mName;
    }

    public void setName(String name) {
        mName.setValue(name);
    }
}