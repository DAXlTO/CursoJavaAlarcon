package indra.talentCamp.layers.persistence;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import indra.talentCamp.layers.models.Jedi;

public class JediMockRepository {

	private List<Jedi> jedis = new LinkedList<Jedi>();
	
	private int ultimoId() {
		return jedis.stream().mapToInt(j -> j.getId()).max().orElse(1);
	}
	
	public List<Jedi> findAll(){
		return Collections.unmodifiableList(jedis);
	}
	
	public Jedi findById(int id) throws NotFoundException {
		return jedis.stream()
				.filter(j -> j.getId() == id)
					.findFirst()
						.orElseThrow( ()-> new NotFoundException());
	}
	
	public void save(Jedi jedi) {
		jedi.setId(ultimoId());
		jedis.add(jedi);
	}
	
	public void update(Jedi jedi) {
		throw new NotImplementedException();
	}
	
	public void delete(int id) throws NotFoundException {
		jedis.remove(findById(id));
	}
}
