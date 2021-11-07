package com.example.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG ="I DON'T KNOW";

    public static void getMessage(String message){
        Log.d(TAG,message);
    }

}
