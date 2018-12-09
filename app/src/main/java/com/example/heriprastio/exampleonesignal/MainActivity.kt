package com.example.heriprastio.exampleonesignal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.onesignal.OneSignal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OneSignal.startInit(this)
            .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
            .unsubscribeWhenNotificationsAreDisabled(true)
            .init()
        OneSignal.setEmail("Heri")
    }
}
