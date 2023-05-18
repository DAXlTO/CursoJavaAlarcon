package indra.talentCamp.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	
	private double numeroCuenta;
	private double saldo;
	private List<Movimiento> movimientos;
	private Cliente cliente;
	
	public CuentaBancaria(double numeroCuenta, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0;
		this.movimientos = new ArrayList<Movimiento>();
		this.cliente = cliente;
	}

	public void depositar(double ingresar) {
		double saldoInicial = getSaldo();
		setSaldo(saldoInicial+ingresar);
		movimientos.add(new Movimiento(ingresar, saldoInicial, getSaldo()));
	}
	
	public abstract boolean extraer(double cantidad);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public double getNumeroCuenta() {
		return numeroCuenta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void addMovimiento(Movimiento mov) {
		movimientos.add(mov);
	}
	
}
