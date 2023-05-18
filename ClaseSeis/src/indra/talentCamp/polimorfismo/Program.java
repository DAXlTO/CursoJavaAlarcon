package indra.talentCamp.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import indra.talentCamps.models.Guerrero;
import indra.talentCamps.models.Jugador;
import indra.talentCamps.models.Mago;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador excalibur = new Guerrero("Excalibur");
		Jugador batman = new Guerrero("Batman");
		Jugador thanos = new Mago("Thanos");

		List<Jugador> personajes = new ArrayList<Jugador>();
		personajes.add(excalibur);
		personajes.add(batman);
		personajes.add(thanos);

		//Comienzo del turno
		System.out.println("-------------------------------------------------------------");
		System.out.println("Comienzo del turno");
		personajes.forEach(System.out::println);
		batman.accion(excalibur);
		personajes.forEach(p -> p.finalizarTurno());
		
		//Fin del turno
		System.out.println("-------------------------------------------------------------");
		System.out.println("Fin del turno. Quedaron vivos:");
		personajes.stream().filter(n -> n.estaVivo()).forEach(System.out::println);
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(3);
		//System.out.println(numeros.stream().filter(n-> n%2== 0)).sum();
		//numeros.stream().mapToDouble(n-> n.getPrecio()).sum();
		
		//Ejercicio 1
		 //estudiantes.stream().filter(e -> e.getCalificacion() > 90).collect(Collectors.col);
		//estudiantes.stream().filter(e -> e.getCalificacion() > 90).forEach(System.out::println);
		
		//Ejercicio 2
		numeros.stream().max((a,b)->(a-b)).orElse(0);
		
		//Ejercicio 3
		numeros.stream().reduce( 0, (a,b) -> Math.max(a, b));
		
		//Ejercicio 4
		System.out.println(numeros.stream().filter(n -> n%2 == 0).mapToInt(n->n).sum());

	
		
	}
}
