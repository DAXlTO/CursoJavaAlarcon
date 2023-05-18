package indra.talentCamp.model;

import java.util.List;

public class CajaAhorro extends Banco{

	public CajaAhorro(double numeroCuenta, double saldo, List<Movimiento> movimientos, Cliente cliente) {
		super(numeroCuenta, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean extraer(double cantidad) {
		if(getSaldo() - cantidad < 0) {
			return false;
		}
		double saldoInicial = getSaldo();
		setSaldo(saldoInicial-cantidad);
		addMovimiento(new Movimiento(cantidad, saldoInicial, getSaldo()));
		return true;
	}


	
}
