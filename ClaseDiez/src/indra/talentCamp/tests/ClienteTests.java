package indra.talentCamp.tests;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import indra.talentCamp.banco.Cliente;

public class ClienteTests {

	@Test
	public void shouldValidateClienteCreation() {
		assertThrows(AssertionError.class, ()->	Cliente.builder().setNombre("mal").build());
		assertThrows(AssertionError.class, ()->	Cliente.builder().setApellido("mal").build());
		assertThrows(AssertionError.class, ()->	Cliente.builder().setNombre("mal").setApellido("2").build());

	}
}
