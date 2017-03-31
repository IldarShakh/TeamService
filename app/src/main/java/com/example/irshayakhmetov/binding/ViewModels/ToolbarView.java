package com.example.irshayakhmetov.binding.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.irshayakhmetov.binding.BR;

/**
 * Created by irshayakhmetov on 14.03.2017.
 */

public class ToolbarView extends BaseObservable{
    @Bindable
    String title;

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    public String getTitle() {
        return title;
    }

    public ToolbarView(){

    }
}
