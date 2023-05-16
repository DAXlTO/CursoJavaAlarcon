package indra.talentCamp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.lambda.models.Persona;

public class Program {
	
	public static void main(String[] args) {
		String frase = "Que la fuerza";
		frase += " te";
		frase += " acompañe";
		System.out.println(frase);
		StringBuilder builder = new StringBuilder();
		builder.append("Que la fuerza");
		builder.append(" te");
		builder.append(" acompañe");
		System.out.println(builder.toString());
		
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Dani",183));
		personas.add(new Persona("Manu",195));

		for(Persona person : personas) {
			System.out.println(person.getNombre());
		}
		personas.forEach(person -> System.out.println(person));
		
		personas.forEach(System.out::println);
		
		List<Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657,865);
		int mayor = 0;
		for(int num : numeros) {
			if(num > mayor) {
				mayor = num;
			}
		}
		System.out.println("El mayor es: " + mayor);
		System.out.println(numeros.stream().max((a,b)->a-b).orElse(0));
		
		System.out.println(personas.stream().max((a,b)->a.getCentimetrosAltura() - b.getCentimetrosAltura()));
		System.out.println(personas.stream().mapToInt(Persona::getCentimetrosAltura).sum());
		System.out.println(personas.stream().mapToInt(Persona::getCentimetrosAltura).average());
		
		List<Integer> numerosMayores = numeros.stream().filter(n -> n>100).collect(Collectors.toList());
		System.out.println(numerosMayores);
		
		List<Persona> personasAltas = personas.stream().filter(n -> n.getCentimetrosAltura()>100).collect(Collectors.toList());
		System.out.println(personasAltas);
		
	}	
}
