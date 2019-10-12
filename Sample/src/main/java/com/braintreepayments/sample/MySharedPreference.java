package com.braintreepayments.sample;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;


//by using singleton pattern

class MySharedPreference {
        //2 step
    private static SharedPreferences prf;

        //1 step
    private MySharedPreference() {
    }// end constructor

        //3 step
    public static SharedPreferences getInstance(Context context) {
        //check prf not yet created
        if (prf == null)
            prf = context.getSharedPreferences(Constants.Keys.USER_DETAILS, MODE_PRIVATE);
        return prf;
    }//end getInstance()


    public static void clearData(Context context) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.clear();
        editor.commit();
    }//end clearData()


    public static void clearValue(Context context, String key) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.remove(key);
        editor.commit();
    }//end clearValue()


    public static void putString(Context context, String key, String value) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.putString(key, value);
        editor.commit();
    }//end putString()


    public static void putInt(Context context, String key, int value) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.putInt(key, value);
        editor.commit();
    }//end putInt()


    public static void putBoolean(Context context, String key, Boolean value) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.putBoolean(key, value);
        editor.commit();
    }//end putBoolean()


    public static void putFloat(Context context, String key, Float value) {
        SharedPreferences.Editor editor = getInstance(context).edit();
        editor.putFloat(key, value);
        editor.commit();
    }//end putFloat()


    public static String getString(Context context, String key, String valueDefault) {
        return getInstance(context).getString(key, valueDefault);
    }//end getString()


    public static int getInt(Context context, String key, int valueDefault) {
        return getInstance(context).getInt(key, valueDefault);
    }//end getInt()


    public static Boolean getBoolean(Context context, String key, Boolean valueDefault) {
        return getInstance(context).getBoolean(key, valueDefault);
    }//end getBoolean()


    public static Long getLong(Context context, String key, Long valueDefault) {
        return getInstance(context).getLong(key, valueDefault);
    }//end getLong()


    public static Float getFloat(Context context, String key, Float valueDefault) {
        return getInstance(context).getFloat(key, valueDefault);
    }//end getFloat


}//end class

