package br.system.system.model;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {

	private Set<Class> classes = new HashSet<>();
	
	public Student(Builder builder) {
		super(builder);
	}

	public Set<Class> getClasses() {
		return classes;
	}
	
	public void addClass(Class class_) {
		classes.add(class_);
		class_.getStudents().add(this);
	}

	@Override
	public String toString() {
		return "Student [id=" + super.getId() + ", name=" + getName() + ", birth date="
				+ getBirthDate() + "]";
	}


	public static class Builder extends Person.Builder<Builder> {
		
		@Override
		public Builder self() {
			return this;
		}
		
		@Override
		public Student build() {
			verify();
			
			return new Student(this);
		}
		
	}

}
