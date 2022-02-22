package br.system.system.repository;

import br.system.system.model.Student;

public class StudentRepository extends BaseRepositoryImpl<Student> {

	private StudentRepository() {
	};

	public static StudentRepository getInstance() {
		return StudentRepositoryInstanceHolder.INSTANCE;
	}

	private static class StudentRepositoryInstanceHolder {
		private static final StudentRepository INSTANCE = new StudentRepository();
	}

}
