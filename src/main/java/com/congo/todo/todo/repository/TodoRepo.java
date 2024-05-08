package com.congo.todo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoRepo, Long> {
}
