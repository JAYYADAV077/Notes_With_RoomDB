package com.example.myapplication


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel: ViewModel() {
    val todoDao = MainAppliaction.todoDataBase.getTodoDao()

    val data: LiveData<List<Todo>> = todoDao.getAllTodo()


    fun addTodo(input: String){

        viewModelScope.launch(Dispatchers.IO) {
            todoDao.addTodo(Todo(tittle = input))
        }

    }


    fun deleteTodo(id: Int){

        viewModelScope.launch(Dispatchers.IO) {
            todoDao.deleteTodo(id)
        }

    }

}