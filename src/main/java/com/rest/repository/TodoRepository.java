package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
