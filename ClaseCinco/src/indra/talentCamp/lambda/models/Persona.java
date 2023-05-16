package indra.talentCamp.lambda.models;

public class Persona {
	
	private String nombre;
	private int centimetrosAltura;
	
	public Persona(String nombre, int centimetrosAltura) {
		super();
		this.nombre = nombre;
		this.setCentimetrosAltura(centimetrosAltura);
	}

	public int getCentimetrosAltura() {
		return centimetrosAltura;
	}

	public void setCentimetrosAltura(int centimetrosAltura) {
		if(centimetrosAltura > 300) throw new Error("No se puede medir mas de 300");
		if(centimetrosAltura < 0) throw new Error("No se puede medir menos de 0");
		this.centimetrosAltura = centimetrosAltura;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", centimetrosAltura=" + centimetrosAltura + "]";
	}
}
