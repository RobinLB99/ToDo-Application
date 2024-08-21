package com.robinlb.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robinlb.todo.model.Subtask;

@Repository
public interface SubtaskRepository extends CrudRepository<Subtask, Long> {

}
