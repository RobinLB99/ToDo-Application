package com.robinlb.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robinlb.todo.model.Task;
import com.robinlb.todo.repository.TaskRepository;
import com.robinlb.todo.service.interfaces.TaskServInterface;

@Service
public class TaskService implements TaskServInterface {

	@Autowired
	private TaskRepository repository;

	@Override
	public Task save(Task tarea) {
		return repository.save(tarea);
	}

	@Override
	public void delete(Task tarea) {
		repository.delete(tarea);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Task find(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Task> findAll() {
		return (List<Task>) repository.findAll();
	}

}
