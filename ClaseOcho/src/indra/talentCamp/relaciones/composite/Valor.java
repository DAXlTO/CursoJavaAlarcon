package indra.talentCamp.relaciones.composite;

public class Valor extends Operacion {

	private double valor;

	public Valor(double valor) {
		super();
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return getValor();
	}

	public double getValor() {
		return valor;
	}

}
