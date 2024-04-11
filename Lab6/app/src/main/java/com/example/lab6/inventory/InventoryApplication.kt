package com.example.lab6.inventory

import android.app.Application
import com.example.lab6.inventory.data.AppContainer
import com.example.lab6.inventory.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
