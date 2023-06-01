package indra.talentCamp.springBoot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import indra.talentCamp.springBoot.models.Automovil;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/api/hello", method = RequestMethod.GET)
	public String Hello() {
		return "Hello World";
	}
	
	@RequestMapping(value="/api/coche", method = RequestMethod.GET)
	public Automovil GetAuto() {
		return new Automovil() {{
			setId(1);
			setMarca("Ferrari");
			setMatricula("1234MD");
			setElectrico(true);
		}};
	}
	
}
