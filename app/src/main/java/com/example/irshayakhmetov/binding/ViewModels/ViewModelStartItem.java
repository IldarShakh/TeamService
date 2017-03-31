package com.example.irshayakhmetov.binding.ViewModels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.irshayakhmetov.binding.Models.User;
import com.example.irshayakhmetov.binding.User;

/**
 * Created by irshayakhmetov on 14.03.2017.
 */

public class Item extends BaseObservable{
    @Bindable
    private User user;

    public Item(String m_name, String work){
        user = new User();

        user.fullName = m_name;
        user.work=work;

    }

    public User getUser(){
        return user;
    }

    public void SetUser(User user){
        this.user = user;
    }
}
