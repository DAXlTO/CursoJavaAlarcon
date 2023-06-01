package indra.talentCamp.maven.controllers;

import java.util.List;

import indra.talentCamp.maven.models.Person;
import indra.talentCamp.maven.services.PersonService;

public class PersonController {

	private PersonService service;
	
	public PersonController() {
		service = new PersonService();
	}
	
	public void mostrarTodas() {
		List<Person> people = service.getPersons();
		StringBuilder builder =  new StringBuilder();
		builder.append("<table>");
		//people.forEach(()_>()) ;
		builder.append("</table>");
	}
}
