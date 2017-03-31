package com.example.irshayakhmetov.binding.ViewModels;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * Created by irshayakhmetov on 21.03.2017.
 */

public class ViewModel {
    public final ObservableList<Item> items = new ObservableArrayList<>();
    public final ItemBinding<Item> itemBinding = ItemBinding.of(BR.item, R.layout.item_user);
    public ViewModel() {
        for(int i=0;i<50;i++){
            items.add(new Item("name"+i,"work"+i));
        }
    }
}
