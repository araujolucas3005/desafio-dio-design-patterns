package br.system.system.model;

import java.util.Objects;

public abstract class BaseEntityImpl implements BaseEntity {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntityImpl other = (BaseEntityImpl) obj;
		return Objects.equals(id, other.id);
	}

}
