package integration.environment;

public class GlassFishEnv extends PersistenceConfig {
	
	public static final String NAME_PERSISTENCE = "MtaAgency";

	@Override
	public boolean isRunningJUnit() {
		return false;
	}

	@Override
	public String getNamePersistance() {
		return GlassFishEnv.NAME_PERSISTENCE;
	}

}