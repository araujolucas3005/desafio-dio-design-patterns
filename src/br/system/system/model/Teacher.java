package br.system.system.model;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {

	private Specialization specialization;
	private Set<Class> classes = new HashSet<>();
	
	private Teacher(Builder builder) {
		super(builder);
		specialization = builder.specialization;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}

	public Set<Class> getClasses() {
		return classes;
	}

	@Override
	public String toString() {
		return "Teacher [specialization=" + specialization.getName() + ", name=" + getName()
				+ ", birth date=" + getBirthDate() + "]";
	}

	public static class Builder extends Person.Builder<Builder> {
		
		private Specialization specialization;
		
		public Builder specialization(Specialization specialization) {
			this.specialization = specialization;
			return this;
		}

		@Override
		public Builder self() {
			return this;
		}

		@Override
		public Teacher build() {
			verify();

			return new Teacher(this);
		}
		
		@Override
		protected void verify() {
			super.verify();
			
			if (specialization == null) {
				throw new IllegalArgumentException("Specialization cannot be null");
			}
		}

	}
}
