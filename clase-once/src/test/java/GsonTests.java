import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import com.google.gson.Gson;

public class GsonTests {

	private String json = "{\"nombre\":\"Dani\",\"edad\":24}";
	Gson gson = new Gson();

	@Test
	public void shouldReadPropertiesFromJson() {
		Properties p =  gson.fromJson(json, Properties.class);
		assertEquals("Dani", p.getProperty("nombre"));
		assertEquals(24, p.getProperty("edad"));
	}
	
	@Test
	public void shouldReadCustomObjectFromJson() {
		
	}
}
