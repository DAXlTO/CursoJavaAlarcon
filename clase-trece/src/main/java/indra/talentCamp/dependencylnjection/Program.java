package indra.talentCamp.dependencylnjection;

import indra.talentCamp.dependencyInjection.contrustor.ConstructorInjectionDemo;
import indra.talentCamp.dependencyInjection.field.FieldInjectionDemo;

public class Program {

	public static void main(String[] args) {
		System.out.println("Constructor injection demo");
		ConstructorInjectionDemo.aTodoGas();
		
		System.out.println("Field injection demo");
		FieldInjectionDemo.aTodoGas();
	}
}
