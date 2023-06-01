package indra.talentCamp.maven.services;

import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.maven.models.Person;
import indra.talentCamp.maven.persistence.PersonRepository;

public class PersonService {

	private PersonRepository repository;
	
	public PersonService() {
		this.repository = new PersonRepository();
	}
	
	public List<Person> getPersons(){
		List<Person> people = repository.findAll();
		return people;
	}
	
	public void addNewPerson(Person p) {
	}
	
	
}
