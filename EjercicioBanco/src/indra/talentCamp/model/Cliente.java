package indra.talentCamp.model;

import java.util.Random;

public class Cliente {

	private String nombre;
	private double identificacion;
	
	public Cliente(String nombre, double identificacion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getIdentificacion() {
		return identificacion;
	}
	
}
