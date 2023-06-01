package indra.talentCamp.dependencyInjection.reflection;

public class PartyService {

	static private Class<? extends Repository> repositoryClass = null;
	private Repository repository;
	
	public PartyService() {
		if(PartyService.repositoryClass==null) {
			throw new Error("Te olvidaste de configurar");
		}
		try {
			this.repository = PartyService.repositoryClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void registerRepositoryClass(Class<Repository> repositoryClass) {
		PartyService.repositoryClass = repositoryClass;
	}
	
	public void haveFun() {
		repository.Save();
	}
}
