package br.system.system.service;

import br.system.system.model.Teacher;
import br.system.system.repository.TeacherRepository;

public class TeacherService extends BaseServiceImpl<Teacher> {
	
	private TeacherService() {
		super(TeacherRepository.getInstance());
	}
	
	public static TeacherService getInstance() {
		return TeacherServiceInstanceHolder.INSTANCE;
	}

	private static class TeacherServiceInstanceHolder {
		private static final TeacherService INSTANCE = new TeacherService();
	}

}
