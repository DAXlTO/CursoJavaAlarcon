package indra.talentCamp.generics;

public class CajaFuerte<T, S> {

	private S password;
	private T valor;
	
	public CajaFuerte(S s, T t) {
		this.password = s;
		this.valor = t;
	}
	
	public void guardarValor(T valor) {
		this.valor = valor;
	}
	
	public T leerValor(T password){
		if(password.equals(this.password)) {
			return this.valor;
		}
		throw new Error("Acceso no autorizado");
	}
}
