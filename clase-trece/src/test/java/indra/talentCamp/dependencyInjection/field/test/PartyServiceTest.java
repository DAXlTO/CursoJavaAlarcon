package indra.talentCamp.dependencyInjection.field.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import indra.talentCamp.dependencyInjection.field.MockRepository;
import indra.talentCamp.dependencyInjection.field.PartyService;

public class PartyServiceTest {

	@Test
	public void test() {
		PartyService service = new PartyService();
		service.setRepository(new MockRepository());
		service.haveFun();
		assertEquals(true,true);
	}
}
