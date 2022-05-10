package com.afs.utils;


import android.app.Activity;

public class AFButterKnife {

    public static void bind(Activity activity) {
        Class clazz = activity.getClass();
        try {
            Class<?> bindViewClass = Class.forName(clazz.getName() + "_ViewBinding");
            IAFBinder iBinder = (IAFBinder) bindViewClass.newInstance();
            iBinder.bind(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}