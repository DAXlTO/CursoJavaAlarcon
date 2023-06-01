package indra.talentCamp.claseDiez;

import java.util.HashMap;
import java.util.Map;

public class Program {

	
	public static void main(String[] args) {
		
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("casa", "donde vive la gente");
		
		if(diccionario.containsKey("auto")) {
			System.out.println("no estoy");
		}
		
		for(var entrada : diccionario.entrySet()) {
			System.out.println(entrada.getKey() + entrada.getValue());
		}
	}
}
