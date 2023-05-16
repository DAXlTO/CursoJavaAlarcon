package model;

public class Perro extends Animal{
	
	public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hacerSonido() {
		return "Wowow";
	}

}
