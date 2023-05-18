package indra.talentCamp.interfaces;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * getAltura() * 2 * getBase();
	}
	
}
