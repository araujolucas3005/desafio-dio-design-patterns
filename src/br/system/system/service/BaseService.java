package br.system.system.service;

import java.util.List;

public interface BaseService<T> {
	
	T save(T data);
	
	List<T> findAll();
	
	T findById(Long id);
	
	void delete(Long id);

}
