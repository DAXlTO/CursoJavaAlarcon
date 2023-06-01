package indra.talentCamp.dependencyInjection.contrustor;

public class PartyService {

	private Repository repository;
	
	public PartyService(Repository repo) {
		repository = repo;
	}
	
	public void haveFun() {
		
		repository.Save();
	}
}
