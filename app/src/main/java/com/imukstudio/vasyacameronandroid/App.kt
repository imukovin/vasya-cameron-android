package com.imukstudio.vasyacameronandroid

import android.app.Application
import android.content.Context

class App: Application() {

    override fun onCreate() {
        appInstance = this
        super.onCreate()
    }

    companion object {
        private lateinit var appInstance: App

        fun getAppContext(): Context = appInstance.applicationContext
    }
}
