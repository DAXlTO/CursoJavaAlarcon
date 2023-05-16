package model;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> animales = new ArrayList<>();
		
		animales.add(new Gato("Gato"));
		animales.add(new Perro("perro"));
		animales.add(new Vaca("Vaca"));
		animales.stream().forEach(n ->System.out.println(n.hacerSonido()));


	}

}
