package br.system.system.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T> {
	
	T save(T data);
	
	List<T> findAll();
	
	Optional<T> findById(Long id);
	
	void deleteById(Long id);

}
