package indra.talentCamp.dependencyInjection.ioc;

public class MockRepository implements Repository{

	public void Save() {
		System.out.println("Entorno controlado");
	}
}
