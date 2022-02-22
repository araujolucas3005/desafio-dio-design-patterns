package br.system.system.repository;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import br.system.system.model.BaseEntity;

public abstract class BaseRepositoryImpl<T extends BaseEntity> implements BaseRepository<T> {
	
	private Long currId = 1L;

	private Set<T> entities = new LinkedHashSet<>();
	
	public T save(T data) {
		data.setId(currId);
		entities.add(data);
		
		currId++;
		
		return data;
	}

	@Override
	public List<T> findAll() {
		return new ArrayList<T>(entities);
	}

	@Override
	public Optional<T> findById(Long id) {
		return entities.stream().filter(entity -> entity.getId() == id).findFirst();
	}

	@Override
	public void deleteById(Long id) {
		Optional<T> entityExists = entities.stream().filter(entity -> entity.getId() == id).findFirst();

		if (!entityExists.isPresent()) {

		}

		entities.remove(entityExists.get());
	}

}
