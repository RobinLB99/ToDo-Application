package com.robinlb.todo.service.interfaces;

import java.util.List;

import com.robinlb.todo.model.Task;

public interface TaskServInterface {

	public Task save(Task tarea);

	public void delete(Task tarea);

	public void deleteById(Long id);

	public Task find(Long id);

	public List<Task> findAll();

}
