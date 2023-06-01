package indra.talentCamp.reflection.models;

public class SuperHeroe {



	private String nombre;
	private String habilidad;
	private int altura;
	private double peso;
	
	public SuperHeroe() {
		
	}
	
	public SuperHeroe(String nombre, String habilidad, int altura, double peso) {
		super();
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.altura = altura;
		this.peso = peso;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void decirSuFrase() {
		System.out.println("El bien siempre vencerá");
	}
	
	public void hacerElBien() {
		System.out.println("Ayudando!!");
	}
	
	public void salvarElMundo() {
		System.out.println("Un día de trabajo más...");
	}
}
