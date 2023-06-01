package indra.talentCamp.layers;

import java.awt.Color;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediFileRepository;
import indra.talentCamp.layers.persistence.SaveErrorException;

public class App {

	public static void main(String[] args) {
		System.out.println("Inicio");
		// TODO Auto-generated method stub
		JediFileRepository prueba = new JediFileRepository();
		try {
			prueba.save(new Jedi("Anakin",1000,Color.RED));
		} catch (SaveErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
