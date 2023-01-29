package com.example.localnotifications.ui.utils

import android.app.NotificationManager
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import androidx.core.app.NotificationCompat
import com.example.localnotifications.R

lateinit var DESCRIPTION: String

class MyNotificationService(
    private val context: Context
) {
    private val notificationManager: NotificationManager =
        context.getSystemService(NOTIFICATION_SERVICE) as NotificationManager

    fun showNotification() {
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.icon)
            .setContentTitle("My notification")
            .setContentText(DESCRIPTION)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

       notificationManager.notify(1, notification)
    }

    companion object {
        const val CHANNEL_ID = "my_notifications"
    }
}