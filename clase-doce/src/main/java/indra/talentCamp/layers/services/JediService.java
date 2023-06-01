package indra.talentCamp.layers.services;

import java.awt.Color;
import java.util.Random;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediMockRepository;

public class JediService {

	private JediMockRepository repository;
	
	public JediService() {
		repository = new JediMockRepository();
	}
	
	private int calcularNivelFuerza(Jedi j) {
		return new Random().nextInt(100,1000000);
	}
	
	private Color crearSableNuevo() {
		return Color.GREEN;
	}
	
	public void alistarse(String nombre){
		Jedi nuevo = new Jedi(nombre, crearSableNuevo());
		nuevo.setNivelDeFuerza(calcularNivelFuerza(nuevo));
	}
}
