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

		
		
	
		
	}
}
