package indra.talentCamp.encapsulamiento;

import indra.talentCamp.encapsulamiento.models.Teacher;
import indra.talentCamp.encapsulamiento.models.Student;
import indra.talentCamp.encapsulamiento.models.Person;


import indra.talentCamp.utils.Console;

public class Program {
	
	public static void main(String[] args) {

	        System.out.println("Bienvenidos al Talent Camp de Java");
        
	       
	        System.out.println("Quien va a dictar el curso?");
	        Teacher jedi = new Teacher(
	        		Console.readString("Como es su nombre?"),
	        		Console.readInt("Cual es su documento?"),
	        		Console.readString("Cual es su direccion?"));

	        
	        System.out.println("Quien va a asistir al curso?");
	        Person padawan = new Person(
	        		Console.readString("Como es su nombre?"),
	        		Console.readInt("Cual es su documento?"),
	        		Console.readString("Cual es su direccion?"));
	        
	        System.out.println("El Profesor es:");
	        System.out.println(jedi);
	        System.out.println("Asisten al curso:");
	        System.out.println(padawan);
	}

}
