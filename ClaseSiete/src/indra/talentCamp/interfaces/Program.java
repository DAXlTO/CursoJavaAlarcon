package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.List;

import indra.talentCamp.generics.CajaFuerte;
import indra.talentCamp.generics.Operacion;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Area> dibujo = Arrays.asList(
				new Circulo(10.0),
				new Triangulo(10,10),
				new Rectangulo(12,6),
				new Planta()
				);
		System.out.println("El area total de mi dibujo es...");
		System.out.println(dibujo.stream().mapToDouble(figura -> figura.calcularArea()).sum());
		
		//System.out.println("El perimetro troal de mi dibujo es...");
		//System.out.println(dibujo.stream().mapToDouble(figura -> figura.calcularPerimetro()).sum());
		
		double perimetroTotal = 0;
		for(Area a : dibujo)
		{
			if(a instanceof Perimetro) {
				perimetroTotal += ((Perimetro)a).calcularPerimetro();
			}
		}
		System.out.println("Perimetro total: " + perimetroTotal);
		
		dibujo.stream().filter(Perimetro.class::isInstance)
			.map(Perimetro.class::cast)
				.mapToDouble(p->p.calcularPerimetro())
					.sum();
		
		//Filtro y me quedo solo con los que son figuras
		List<Figura> figuras = dibujo.stream().filter(Figura.class::isInstance).map(Figura.class::cast).toList();
		
		Operacion<Integer> suma = (a,b)->(a+b);
		Integer res = suma.operar(2,2);
		System.out.println("Sumar 2+2: " + res);
		CajaFuerte<String, String> claveTexto = new CajaFuerte<String, String>("Contraseña","La clave del banco");
		System.out.println(claveTexto.leerValor("Contraseña"));
		System.out.println("Vamos a probar una clave errónea\n");
		try {
			String mal = claveTexto.leerValor("prueba");
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}
