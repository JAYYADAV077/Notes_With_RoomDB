package com.example.myapplication.DB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDataBase: RoomDatabase() {

    companion object{
        const val NAME = "TodoDB"
    }

    abstract fun getTodoDao(): TodoDao
}