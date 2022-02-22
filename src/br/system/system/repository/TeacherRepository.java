package br.system.system.repository;

import br.system.system.model.Teacher;

public class TeacherRepository extends BaseRepositoryImpl<Teacher> {
	
	private TeacherRepository() {
	};

	public static TeacherRepository getInstance() {
		return TeacherRepositoryInstanceHolder.INSTANCE;
	}

	private static class TeacherRepositoryInstanceHolder {
		private static final TeacherRepository INSTANCE = new TeacherRepository();
	}

}
