package indra.talentCamp.dependencyInjection.contrustor;

public class ConstructorInjectionDemo {

	public static void aTodoGas() {
		PartyService service = new PartyService(new DatabaseRepository());
		service.haveFun();
	}
}
