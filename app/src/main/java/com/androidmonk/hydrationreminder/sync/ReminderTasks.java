package com.androidmonk.hydrationreminder.sync;

import android.content.Context;

import com.androidmonk.hydrationreminder.utilities.PreferenceUtilities;

public class ReminderTasks {

    public static String ACTION_WATER_INCREMENT_WATER_COUNT = "increment-water-count";

    public static void executeTask(Context context, String action){
        if (ACTION_WATER_INCREMENT_WATER_COUNT == action){
            incrementWaterCount(context);
        }
    }


    private static void incrementWaterCount(Context context){
        PreferenceUtilities.incrementWaterCount(context);
    }

}
