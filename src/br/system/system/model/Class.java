package br.system.system.model;

import java.util.HashSet;
import java.util.Set;

public class Class extends BaseEntityImpl {
	
	private String name;
	private Teacher teacher;
	private Set<Student> students = new HashSet<>();
	
	private Class(Builder builder) {
		name = builder.name;
		teacher = builder.teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		student.getClasses().add(this);
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", teacher=" + teacher.getName() + "]";
	}

	public static class Builder {
		
		private String name;
		private Teacher teacher;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder teacher(Teacher teacher) {
			this.teacher = teacher;
			return this;
		}
		
		public Class build() {
			verify();
			
			return new Class(this);
		}
		
		private void verify() {
			if (name == null) {
				throw new IllegalArgumentException("name cannot be null");
			}
			
			if (teacher == null) {
				throw new IllegalArgumentException("teacher cannot be null");
			}
		}
		
	}
	
}
