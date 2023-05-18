package indra.talentCamp.relaciones;

import indra.talentCamp.relaciones.composite.Multiplicacion;
import indra.talentCamp.relaciones.composite.Operacion;
import indra.talentCamp.relaciones.composite.Suma;
import indra.talentCamp.relaciones.composite.Valor;
import org.mozilla.javascript.*;

public class Program {

	public static void main(String[] args) {
		Operacion calculo = new Suma(
				new Valor(2),
				new Multiplicacion(new Valor(2), new Valor(3))
				);
		System.out.println("2+2*3=" + calculo.calcular());
		
		calculo = new Suma(
				new Multiplicacion(new Valor(6), new Valor(5)),
				new Multiplicacion(new Valor(8), new Valor(3))
				);
		System.out.println("6*5+8*3=" + calculo.calcular());
		
		calculo = new Suma(
				new Suma(new Multiplicacion(3,8),new Multiplicacion(4,3)),
				new Valor(5)
				);
		System.out.println("5+3*8+4*3=" + calculo.calcular());
		String expresion = "5+3*8+4*3";

/*
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			var result = engine.eval(expresion);
			System.out.println("El resultado es " + result);
		}catch(Exception ex) {
			System.out.println("Error al ejecutar " + expresion);
		}
*/
		Context context = Context.enter();
		try {
			var resultado = context.evaluateString(context.initSafeStandardObjects(), 
									expresion, 
										expresion, 
											1, 
												null);
			System.out.println("El resultado es " + resultado);
		} finally {
			Context.exit();
		}
		
		
	}

}
