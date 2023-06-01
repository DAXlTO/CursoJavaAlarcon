package indra.talentCamp.dependencyInjection.reflection;

public class ReflectionInjectionDemo {

	public static void aTodoGas() {
		PartyService.registerRepositoryClass(DatabaseRepository.class);
		PartyService service = new PartyService();
		service.haveFun();
	}
}
