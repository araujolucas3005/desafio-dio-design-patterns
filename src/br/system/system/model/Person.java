package br.system.system.model;

import java.time.LocalDate;

public abstract class Person extends BaseEntityImpl {
	
	private String name;
	private LocalDate birthDate;
	
	public Person(Builder<?> builder) {
		name = builder.name;
		birthDate = builder.birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public abstract static class Builder<T extends Builder<T>> {
		
		private String name;
		private LocalDate birthDate;
		
		public abstract Person build();
		
		public abstract T self();
		
		public T name(String name) {
			this.name = name;
			return self();
		}
		
		public T birthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return self();
		}
		
		protected void verify() {
			if (name == null) {
				throw new IllegalArgumentException("name cannot be null");
			}
			
			if (birthDate == null) {
				throw new IllegalArgumentException("birth date cannot be null");
			}
		}
		
	}

}
