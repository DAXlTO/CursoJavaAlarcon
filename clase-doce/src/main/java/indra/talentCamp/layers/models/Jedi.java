package indra.talentCamp.layers.models;

import java.awt.Color;

public class Jedi extends BusinessObject{
	
	
	private String nombre;
	private int nivelDeFuerza;
	private Color colorLightsaber;

	public Jedi(String nombre, int nivelDeFuerza, Color colorLightsaber) {
		this.nombre = nombre;
		this.nivelDeFuerza = nivelDeFuerza;
		this.colorLightsaber = colorLightsaber;
	}

	public Jedi(String nombre, Color colorLightsaber) {
		this.nombre = nombre;
		this.nivelDeFuerza = 0;
		this.colorLightsaber = colorLightsaber;
	}
	public String getNombre() {
		return nombre;
	}

	public int getNivelDeFuerza() {
		return nivelDeFuerza;
	}

	public Color getColorLightsaber() {
		return colorLightsaber;
	}

	public void setNivelDeFuerza(int nivelDeFuerza) {
		this.nivelDeFuerza = nivelDeFuerza;
	}
}
