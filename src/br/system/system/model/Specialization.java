package br.system.system.model;

public class Specialization extends BaseEntityImpl {

	private String name;
	
	public Specialization(Builder builder) {
		name = builder.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Specialization [name=" + name + "]";
	}

	public static class Builder {

		private String name;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Specialization build() {
			verify();

			return new Specialization(this);
		}

		private void verify() {
			if (name == null) {
				throw new IllegalArgumentException("name cannot be null");
			}
		}

	}

}
