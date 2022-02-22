package br.system.system.service;

import br.system.system.model.Specialization;
import br.system.system.repository.SpecializationRepository;

public class SpecializationService extends BaseServiceImpl<Specialization> {
	
	private SpecializationService() {
		super(SpecializationRepository.getInstance());
	}
	
	public static SpecializationService getInstance() {
		return SpecializationServiceInstanceHolder.INSTANCE;
	}

	private static class SpecializationServiceInstanceHolder {
		private static final SpecializationService INSTANCE = new SpecializationService();
	}

}
