package indra.talentCamp.dependencyInjection.contrustor;

public class MockRepository implements Repository{

	public void Save() {
		System.out.println("Entorno controlado");
	}
}
