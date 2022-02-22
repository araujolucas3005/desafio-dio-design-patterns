package br.system.system.service;

import br.system.system.model.Class;
import br.system.system.repository.ClassRepository;

public class ClassService extends BaseServiceImpl<Class> {
	
	private ClassService() {
		super(ClassRepository.getInstance());
	}
	
	public static ClassService getInstance() {
		return ClassServiceInstanceHolder.INSTANCE;
	}

	private static class ClassServiceInstanceHolder {
		private static final ClassService INSTANCE = new ClassService();
	}

}
