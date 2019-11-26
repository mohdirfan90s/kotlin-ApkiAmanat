package com.example.testapp

import android.app.Application
import android.content.Context
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

class TestApp  : Application(), KodeinAware {

    companion object {
        var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = getApplicationContext();
    }

    override val kodein = Kodein.lazy {

    }
}