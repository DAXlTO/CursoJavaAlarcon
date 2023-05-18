package indra.talentCamp.model;

import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(double numeroCuenta, double saldo, List<Movimiento> movimientos, Cliente cliente) {
		super(numeroCuenta, cliente);
	}



	@Override
	public boolean extraer(double cantidad) {
		if(getSaldo() - cantidad < -1000) {
			return false;
		}
		double saldoInicial = getSaldo();
		setSaldo(saldoInicial-cantidad);
		addMovimiento(new Movimiento(cantidad, saldoInicial, getSaldo()));
		return true;
	}

}
