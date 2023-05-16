package model;

public abstract class Animal {

	private String nombre;
	
	public Animal(String nombre) {
		this.nombre= nombre;
	}
	
	abstract String hacerSonido();
}
