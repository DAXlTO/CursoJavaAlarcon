package indra.talentCamp.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		// TODO Auto-generated method stub
		//indra.talentCamp.reflection.models.SuperHeroe
		System.out.println("Clase Reflfection");
		String className;
		Class<?> clazz = null;
		try(Scanner in = new Scanner(System.in)){
			boolean claseEncontrada = false;
			while(!claseEncontrada) {
				System.out.println("Ingrese el nombre de la clase para instanciar un objeto");
				className = in.nextLine();
				try {
					clazz = Class.forName(className);
					claseEncontrada = true;
				}catch(Exception ex) {
					System.out.println("Clase no encontrada.");
				}
			}
			System.out.println("Los atributos de la clase son:");
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.printf("%s\n",field.getName());
			}
			List<Method> metodos = Arrays.asList(clazz.getDeclaredMethods());
			metodos = metodos.stream().filter(m->!m.getName().startsWith("set") && !m.getName().startsWith("get")).toList();
			for(Method metodo : metodos) {
				System.out.printf("%s\n",metodo.getName());
			}
			
			Object objeto = clazz.getConstructors()[0].newInstance();
			String modificarAtributo = in.nextLine();
			while(modificarAtributo.equalsIgnoreCase("S")) {
				boolean encontrado = false;
				while(!encontrado) {
					System.out.println("¿Qué atributo quieres modificar?");
					modificarAtributo = in.nextLine();
					try {
						Field f = clazz.getDeclaredField(modificarAtributo);
						String valor = in.nextLine();
						f.set(objeto, valor);
					}catch(Exception ex) {
						System.out.println("No se pudo");
					}
				}
			}
		}
	}
}
