package com.example.irshayakhmetov.binding.Common;

import android.app.Activity;
import android.support.annotation.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by irshayakhmetov on 14.03.2017.
 */

public class ContextUtil {


    @Nullable
    public static Object GetTopContext() {
        Object topActivity = null;
        try {

            topActivity = ContextApplication.topActivity;

        } catch (final IllegalArgumentException ignored) {
        }
        return topActivity;
    }

    /*public static ContextApplication GetContextApplication() {
        if (((Activity) GetTopContext()) != null) {
            return (ContextApplication) ((Activity) GetTopContext()).getApplicationContext();
        }
        return null;
    }

    private static Object GetApplicationContext() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        final Class<?> activityThreadClass =
                Class.forName("android.app.ActivityThread");
        final Method method = activityThreadClass.getMethod("currentApplication");
        return method.invoke(null, (Object[]) null);
    }*/


    public static void SetTopContext(Activity activity) {
        ContextApplication.topActivity = activity;
    }


}
