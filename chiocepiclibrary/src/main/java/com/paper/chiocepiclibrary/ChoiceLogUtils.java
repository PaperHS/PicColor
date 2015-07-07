package com.paper.chiocepiclibrary;

import android.util.Log;

/**
 * power by
 * <p/>
 * d8888b.  .d8b.  d8888b. d88888b d8888b.
 * 88  `8D d8' `8b 88  `8D 88'     88  `8D
 * 88oodD' 88ooo88 88oodD' 88ooooo 88oobY'
 * 88~~~   88~~~88 88~~~   88~~~~~ 88`8b
 * 88      88   88 88      88.     88 `88.
 * 88      YP   YP 88      Y88888P 88   YD
 * <p/>
 * <p/>
 * Created by Paper on 15/7/7 2015.
 */
public class ChoiceLogUtils {

    public static boolean DEBUG = true;
    public static String TAG = "choicepic";

    public static void e(String s){
        if (DEBUG)
            Log.e(TAG,s);
    }
    public static void d(String s){
        if (DEBUG)
            Log.d(TAG,s);
    }



}
