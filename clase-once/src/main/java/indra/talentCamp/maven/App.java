package indra.talentCamp.maven;

import java.util.Properties;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo maven");
		String json = "{\"nombre\":\"Dani\",\"edad\":24}";

		Gson gson = new Gson();
		Properties p =  gson.fromJson(json, Properties.class);
		System.out.println("El nombre es: " + p.getProperty("nombre"));
		System.out.println("La edad es: " + p.getProperty("edad"));

	}

}
