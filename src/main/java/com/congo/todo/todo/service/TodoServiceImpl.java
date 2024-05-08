package com.congo.todo.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TodoServiceImpl implements Todo{

    @Autowired// Because we want to use methods from Db we need to connect the repo with the project
    private Todo todoRepo;

    @Override //Overriding the methods we have in the service and reusing them in our implementation
    public List<Todo> getAllTodo(){ //return
       return todoRepo.findAll();
    }

     @Override
    public void saveTodo(Todo todo){
        this.todoRepo.save(todo);
     }

    @Override
    public void updateTodo(Long id, Todo todo) {
        Todo todoFromDb =todoRepo.findById(id).get();
        todoFromDb.setTaskName(todo.getTaskName());
        todoFromDb.setTaskName(todo.getDesc());
        todoRepo.save(todoFromDb);
    }

    @Override
    public Todo getToDoById(Long id) {
        return null;
    }

    @Override
    public void deleteToDo(Long id) {
      this.todoRepo.deleteById(id);
    }

    @Override
    public Todo getTodoById(Long id) {
         Optional<Todo> optional = todoRepo.findById(id);
         Todo todo;
         if(optional.isPresent()){
             todo = optional.get();
         }
         else{
             throw new RuntimeException("Todo for the id " + id + "is not found");
         }

         return todo;
     }

}



