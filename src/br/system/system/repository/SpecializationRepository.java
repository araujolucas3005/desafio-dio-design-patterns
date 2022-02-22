package br.system.system.repository;

import br.system.system.model.Specialization;

public class SpecializationRepository extends BaseRepositoryImpl<Specialization> {
	
	private SpecializationRepository() {
	};

	public static SpecializationRepository getInstance() {
		return SpecializationRepositoryInstanceHolder.INSTANCE;
	}

	private static class SpecializationRepositoryInstanceHolder {
		private static final SpecializationRepository INSTANCE = new SpecializationRepository();
	}

}
