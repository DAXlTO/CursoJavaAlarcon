package indra.talentCamp.layers.persistence;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import indra.talentCamp.layers.models.Jedi;

public class JediFileRepository {
	
	private int getJediCount() {
		File archivo = new File("./jedis");
		return archivo.listFiles().length;
	}
	
	public Jedi findById(int id) throws NotFoundException {
		File archivo = new File(String.format("./jedis/%d.txt",id));	
		if(!archivo.exists()) {
			throw new NotFoundException();
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader(archivo));
			String linea = reader.readLine();
			String[] lineas = linea.split(";");
			return new Jedi(lineas[1],Integer.parseInt(lineas[2]), new Color(Integer.parseInt(lineas[3])));
		}catch(Exception ex) {
			throw new NotFoundException();
		}
	}


	public void save(Jedi j) throws SaveErrorException {
		j.setId(getJediCount()+1);
		File archivo = new File(String.format("./jedis/%d.txt",j.getId()));	
		try {
			archivo.createNewFile();
			try(FileWriter writer = new FileWriter(archivo)){
				writer.write(j.getId());
				writer.write(j.getNivelDeFuerza());
				writer.write(j.getNombre());
				writer.write(j.getColorLightsaber().toString());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
