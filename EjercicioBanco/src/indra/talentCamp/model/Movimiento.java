package indra.talentCamp.model;

public class Movimiento {
	
	private double cantidad;
	private double saldoInicial;
	private double saldoFinal;
	
	public Movimiento(double cantidad, double saldoInicial, double saldoFinal) {
		super();
		this.cantidad = cantidad;
		this.saldoInicial = saldoInicial;
		this.saldoFinal = saldoFinal;
	}

	public double getCantidad() {
		return cantidad;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public double getSaldoFinal() {
		return saldoFinal;
	}

}
