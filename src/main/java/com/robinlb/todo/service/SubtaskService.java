package com.robinlb.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robinlb.todo.model.Subtask;
import com.robinlb.todo.repository.SubtaskRepository;
import com.robinlb.todo.service.interfaces.SubtaskServInterface;

@Service
public class SubtaskService implements SubtaskServInterface {

	@Autowired
	private SubtaskRepository repository;

	@Override
	public Subtask save(Subtask subtarea) {
		return repository.save(subtarea);
	}

	@Override
	public void delete(Subtask subtarea) {
		repository.delete(subtarea);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Subtask find(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Subtask> findAll() {
		return (List<Subtask>) repository.findAll();
	}

}
