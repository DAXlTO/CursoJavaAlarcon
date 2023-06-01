package indra.talentCamp.tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talentCamp.banco.*;

class CuentaBancariaTests {

	Cliente c;
	
	@BeforeEach
	public void before() {
		System.out.println("Antes de ejecutar");
		c = Cliente.builder().setIdentificador(123).setNombre("Dani").setApellido("Alarcón").build();
	}
	
	@Test
	void ShouldAutoIncrementCuentaBancariaNumero(){
		
		Banco banco = new Banco();
		Cliente c = new Cliente(123, "Dni","Alarcon");
		
		CuentaBancaria cuentaUno = banco.crearCuentaCorriente(c);
		CuentaBancaria cuentaDos = banco.crearCajaDeAhorrro(c);
		
		assertTrue("Las dos cuentas no coinciden", cuentaUno.getNumeroCuenta() < cuentaDos.getNumeroCuenta());
		assertEquals(2, cuentaUno.getNumeroCuenta());
		assertEquals(3, cuentaDos.getNumeroCuenta());
	}
	
	@Test
	void ShouldNotBeAbleToExtractMoreFromCajaDeAhorro() {
		Banco banco = new Banco();
		CuentaBancaria cajaDeAhorro = banco.crearCajaDeAhorrro(c);
		cajaDeAhorro.depositar(1000);
		
		assertTrue(cajaDeAhorro.getSaldo()>0);
		
		assertThrows(SaldoInsuficienteException.class, () -> cajaDeAhorro.extraer(2000));		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void ShouldExtractCorrectly() throws SaldoInsuficienteException {
		Banco banco = new Banco();
		Cliente c = new Cliente(123, "Dni","Alarcon");
		
		CuentaBancaria cajaDeAhorro = banco.crearCajaDeAhorrro(c);
		cajaDeAhorro.depositar(1000);
		cajaDeAhorro.extraer(500);
		assertTrue(cajaDeAhorro.getSaldo()==500);
	}
	
	
	
	
}
