package com.example.myapplication

object TodoManager{
    val list = mutableListOf<Todo>()

    fun getAllTodo(): List<Todo>{
        return list
    }

    fun addTodo(input: String){
        list.add(Todo(System.currentTimeMillis().toInt(),tittle = input))
    }
}