package indra.talentCamp.database.persistence;

import java.util.List;

public interface Repository<Persona> {
	
	public void save(Persona nuevo) throws SaveErrorException;
	public void update(Persona existente) throws UpdateErrorException;
	public void delete(int id) throws NotFoundException;
	public List<Persona> findAll();
	public Persona findById(int id) throws NotFoundException;
	
}
