package com.robinlb.todo.service.interfaces;

import java.util.List;

import com.robinlb.todo.model.Subtask;

public interface SubtaskServInterface {

	public Subtask save(Subtask subtarea);

	public void delete(Subtask subtarea);

	public void deleteById(Long id);

	public Subtask find(Long id);

	public List<Subtask> findAll();

}
