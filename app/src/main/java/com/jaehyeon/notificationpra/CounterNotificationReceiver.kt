package com.jaehyeon.notificationpra

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Created by Jaehyeon on 2022/08/06.
 */
class CounterNotificationReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        val service = NotificationService(context)
        service.showNotification(++Counter.value)
    }

}