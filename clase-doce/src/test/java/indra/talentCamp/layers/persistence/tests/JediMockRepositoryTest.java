package indra.talentCamp.layers.persistence.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediMockRepository;
import indra.talentCamp.layers.persistence.NotFoundException;

class JediMockRepositoryTest {

	@Test
	void shouldThrowAndExceptionIfNotFound() {
		JediMockRepository repo = new JediMockRepository();
		assertThrows(NotFoundException.class,()-> repo.findById(28));
	}
	
	@Test
	void shouldSaveAndThenFind() throws NotFoundException {
		JediMockRepository repo = new JediMockRepository();

		Jedi joda = new Jedi("Joda", 10000, Color.GREEN);
		
		repo.save(joda);
		
		Jedi jodaRenacido = repo.findById(1);
		
		assertEquals(joda.getNombre(), jodaRenacido.getNombre());
		
	}

}
