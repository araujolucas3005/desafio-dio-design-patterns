package br.system.system.repository;

public class ClassRepository extends BaseRepositoryImpl<br.system.system.model.Class> {

	private ClassRepository() {
	};

	public static ClassRepository getInstance() {
		return CLassRepositoryInstanceHolder.INSTANCE;
	}

	private static class CLassRepositoryInstanceHolder {
		private static final ClassRepository INSTANCE = new ClassRepository();
	}

}
