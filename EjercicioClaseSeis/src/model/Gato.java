package model;

public class Gato extends Animal{

	public Gato(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hacerSonido() {
		return "Miau miau";
	}
}
