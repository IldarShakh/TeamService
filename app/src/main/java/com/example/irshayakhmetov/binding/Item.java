package com.example.irshayakhmetov.binding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

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
