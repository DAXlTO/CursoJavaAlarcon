package indra.talentCamp.dependencyInjection.ioc;

public class PartyService {

	private Repository repository;
	
	public void haveFun() {
		
		repository.Save();
	}
}
