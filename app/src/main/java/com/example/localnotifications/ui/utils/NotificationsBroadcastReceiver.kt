package com.example.localnotifications.ui.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotificationsBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let {
            val service = MyNotificationService(it)
            service.showNotification()
        }
    }
}