package br.system.system.service;

import br.system.system.model.Student;
import br.system.system.repository.StudentRepository;

public class StudentService extends BaseServiceImpl<Student> {
	
	private StudentService() {
		super(StudentRepository.getInstance());
	}
	
	public static StudentService getInstance() {
		return StudentServiceInstanceHolder.INSTANCE;
	}

	private static class StudentServiceInstanceHolder {
		private static final StudentService INSTANCE = new StudentService();
	}

}
