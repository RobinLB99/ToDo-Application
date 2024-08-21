package com.robinlb.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robinlb.todo.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
