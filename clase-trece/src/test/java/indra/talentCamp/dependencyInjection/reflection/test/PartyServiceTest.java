package indra.talentCamp.dependencyInjection.reflection.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import indra.talentCamp.dependencyInjection.reflection.MockRepository;
import indra.talentCamp.dependencyInjection.reflection.PartyService;

public class PartyServiceTest {

	@Before
	public void configure() {
		PartyService.registerRepositoryClass(MockRepository.class);
		}
	
	@Test
	public void test() {
			PartyService service = new PartyService(); 
			service.haveFun();
			assertEquals(true, true);
	} 
}
