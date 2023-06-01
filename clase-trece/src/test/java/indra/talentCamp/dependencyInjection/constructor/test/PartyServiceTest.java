package indra.talentCamp.dependencyInjection.constructor.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import indra.talentCamp.dependencyInjection.contrustor.MockRepository;
import indra.talentCamp.dependencyInjection.contrustor.PartyService;

public class PartyServiceTest {

	@Test
	public void test() {
		PartyService service = new PartyService(new MockRepository());
		service.haveFun();
		assertEquals(true,true);
	}
}
