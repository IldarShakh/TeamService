package com.example.irshayakhmetov.binding.Adapters;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.databinding.BindingAdapter

import com.example.irshayakhmetov.binding.Interfaces.IEditableProperty;


/**
 * Created by ilsac on 31.03.2017.
 */

public class BindingAdapters {

    @BindingAdapter({"binding"})
    public void setTxtValues(EditText view, final IEditableProperty property){
        view.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                 property.set(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        String newValue = property.get();
        if (!view.getText().toString().equals(newValue)) {
            view.setText(newValue);
        }



    }
}
