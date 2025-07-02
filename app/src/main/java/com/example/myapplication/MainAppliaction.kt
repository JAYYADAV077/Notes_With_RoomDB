package com.example.myapplication

import android.app.Application
import androidx.room.Room
import com.example.myapplication.DB.TodoDataBase

class MainAppliaction: Application() {

    companion object{
        lateinit var todoDataBase: TodoDataBase
    }

    override fun onCreate() {
        super.onCreate()
       todoDataBase = Room.databaseBuilder(
            applicationContext,
            TodoDataBase::class.java,
            TodoDataBase.NAME
        ).build()
    }
}