package com.congo.todo.todo;


import com.congo.todo.todo.service.Todo;
import com.congo.todo.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class Todocontroller {

    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping
    public List<Todo> findAll(){
        return todoService.getAllTodo();
    }

    @PostMapping
    public Todo findOne(@PathVariable Long id, @RequestBody Long){
      return  todoService.getTodoById(id);
    }

    @PutMapping("/{id}")
    public Todo findOne(@PathVariable Long id){
        return todoService.getTodoById(id)
    }
}
