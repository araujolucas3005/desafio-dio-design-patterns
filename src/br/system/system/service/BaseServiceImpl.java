package br.system.system.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import br.system.system.repository.BaseRepository;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	protected BaseRepository<T> repository;

	protected BaseServiceImpl(BaseRepository<T> repository) {
		this.repository = repository;
	}

	@Override
	public T save(T data) {
		return repository.save(data);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T findById(Long id) {
		Optional<T> entity = repository.findById(id);

		if (!entity.isPresent()) {
			throw new NoSuchElementException("entity not found");
		}

		return entity.get();
	}

	@Override
	public void delete(Long id) {
		Optional<T> entity = repository.findById(id);

		if (!entity.isPresent()) {
			throw new NoSuchElementException("entity not found");
		}

		repository.deleteById(id);
	}

}
