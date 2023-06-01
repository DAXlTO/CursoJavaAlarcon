package indra.talentCamp.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		String frase = "Esto es una frase para contar la ocurrencia de cada palabra";
		
		String[] dividido = frase.split(" ");
		
		Map<String, Integer> cuenta = new HashMap<>();
		
		for(int i = 0; i < dividido.length; i++) {
			Integer numero = cuenta.putIfAbsent(dividido[i], 1);
			if(numero != null) {
				cuenta.put(dividido[i], ++numero);
			}
		}

		for(var entrada : cuenta.entrySet()) {
			System.out.println(entrada.getKey() + entrada.getValue());
		}
	}
}
