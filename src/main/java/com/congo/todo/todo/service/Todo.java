package com.congo.todo.todo.service;

import java.util.List;
import java.util.Optional;

public interface Todo {

    List<Todo> getAllTodo();


    void saveTodo(Todo todo);

    void updateTodo(Long id, Todo todo);

    Todo getToDoById(Long id);

    void deleteToDo(Long id);


   ;
}
