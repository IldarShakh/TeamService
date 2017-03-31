package com.example.irshayakhmetov.binding.Service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.irshayakhmetov.binding.Common.ContextUtil;
import com.example.irshayakhmetov.binding.Views.ListActivity;

/**
 * Created by irshayakhmetov on 14.03.2017.
 */

public class NavigationService implements INavigationService {

    int REQUEST_CODE_DEFAULT = 0;


    public void goToList(){
        Object topActivity = ContextUtil.GetTopContext();
        try {
            Intent intent = new Intent((Context) topActivity, ListActivity.class);
            assert (topActivity) != null;
            ((Activity) topActivity).startActivityForResult(intent, REQUEST_CODE_DEFAULT);
            // SlideActivity((Activity) topActivity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
