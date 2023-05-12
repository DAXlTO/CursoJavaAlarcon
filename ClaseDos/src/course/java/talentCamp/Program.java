package course.java.talentCamp;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void cambiarValor(int n) {
		n = 20;
	}
	
	public static void cambiarRectangulo(Rectangulo  rec) {
		rec.base = 2000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prueba");
		
		int num = 3;
		int b = 20;
		
		num = b;
		
		System.out.println(num);
		
		Rectangulo r = new Rectangulo();
		r.base = 10;
		r.altura = 20;
		System.out.println(r);
		
		Rectangulo r2 = null;
		r2 = new Rectangulo();
		r2.altura = 20;
		r2.base = 15;
		System.out.println(r2.altura);
		
		r2 = r;
		r.altura=100;
		System.out.println(r2.altura);
		cambiarRectangulo(r);
		System.out.println(r.base);
		
		int a = 555;
		cambiarValor(a);
		System.out.println(a);
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Dani");
		nombres.add("Javi");
		nombres.add("Borja");

		String nombreActual = null;
		for(int i = 0; i < nombres.size(); i++) {
			nombreActual = nombres.get(i);
			System.out.println(nombreActual);
		}
	
		
		
		
		
		
		
		
	}
}
