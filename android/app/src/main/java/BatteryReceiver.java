package com.example.your_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra("level", 0);
        if (level >= 90) {
            Toast.makeText(context, "Battery is charged over 90%", Toast.LENGTH_SHORT).show();
        }
    }
}
