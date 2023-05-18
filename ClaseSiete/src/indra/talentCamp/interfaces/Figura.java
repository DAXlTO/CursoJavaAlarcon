package indra.talentCamp.interfaces;

public abstract class Figura implements Area, Perimetro, Comparable<Figura>{

	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	@Override
	public int compareTo(Figura o) {
		return (int) calcularArea() - (int) o.calcularArea();
	}
}