package com.androidmonk.hydrationreminder.sync;

import android.content.Context;

import com.androidmonk.hydrationreminder.utilities.NotificationsUtils;
import com.androidmonk.hydrationreminder.utilities.PreferenceUtilities;

public class ReminderTasks {

    public static String ACTION_WATER_INCREMENT_WATER_COUNT = "increment-water-count";
    public static final String ACTION_DISMISS_NOTIFICATION = "dismiss-notification";

    static final String ACTION_CHARGING_REMINDER = "charging-reminder";

    public static void executeTask(Context context, String action){
        if (ACTION_WATER_INCREMENT_WATER_COUNT == action){
            incrementWaterCount(context);
        }else if (ACTION_DISMISS_NOTIFICATION.equals(action)){
            NotificationsUtils.clearAllNotifications(context);
        }else if (ACTION_CHARGING_REMINDER.equals(action)){
            issuingChargingReminder(context);
        }
    }


    private static void incrementWaterCount(Context context){
        PreferenceUtilities.incrementWaterCount(context);
        NotificationsUtils.clearAllNotifications(context);
    }

    private static void issuingChargingReminder(Context context){
        PreferenceUtilities.incrementWaterCount(context);
        NotificationsUtils.remindUserBecauseCharging(context);
    }

}
