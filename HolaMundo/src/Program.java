
public class Program {

	public static void main(String[] args) {
		System.out.println("HolaMundo");
		
		int numero = 20;
		System.out.println(numero);
		float ao = 23f;
		System.out.println(ao);
		boolean verdadero = true;
		System.out.println(verdadero);
		
		String nom = "Dani";
		System.out.println(nom);
		
		@SuppressWarnings("removal")
		Integer num = new Integer(2);
		System.out.println(num);
		
		ao = numero;
		
		String enLetras = Integer.toString(numero);
		System.out.println("El número es " + enLetras);
		
		enLetras="22";
		numero = Integer.parseInt(enLetras);
		System.out.println(enLetras);
		
		try {
			enLetras = "22Los";
			numero = Integer.parseInt(enLetras);
		}catch(NumberFormatException ex) {
			System.out.println("No se pudo convertir el número " + enLetras);
		}
		catch(Exception ex) {
			System.out.println("Error inesperado");
			ex.printStackTrace();
		}
		
		String numeroFloat = "22.3";
		float number = Float.parseFloat(numeroFloat);
		System.out.println("Número en float: " + number);
		
		
		
		
	}

}