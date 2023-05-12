import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Program {
	
	public static void ejemploBufferedReader() {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese su nombre: ");
		
		try {
			String nombre = reader.readLine();
			System.out.println("Ingrese su edad: ");
			int edad = Integer.parseInt(reader.readLine());

			System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
		}catch(IOException ex) {
			System.err.print(ex.getMessage());
		}catch(NumberFormatException ex){
			System.out.println("Tienes que introducir un número.");
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args){
		//ejemploBufferedReader();
		Scanner in = new Scanner(System.in);
		//System.out.println("Introduce tu apellido: ");
		//System.out.println("Te apellidas " + in.nextLine());
		
		
		Random r = new Random();
		System.out.println("Adivina el número que estoy pensando");
		int numero = r.nextInt(1,100);
		int adivina;
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce un número: ");
			adivina = in.nextInt();
			if(adivina == numero) {
				System.out.println("has acertado!!");
				break;
			}else if(adivina < numero) {
				System.out.println("Te has quedado corto");
			}else {
				System.out.println("Te has pasado");
			}
		}
		System.out.println("El número era " + numero);
	}
	
	public static int readInt() {
		String numero = null;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Introduce un númoer: ");
			numero = in.nextLine();
		}while(!esNumerico(numero));
		
		return Integer.valueOf(numero);
	}
	
	public static <T> boolean esNumerico(T numero) {
		try {
			Integer.parseInt(numero.toString());
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
