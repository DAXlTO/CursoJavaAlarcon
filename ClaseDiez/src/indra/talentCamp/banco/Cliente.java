package indra.talentCamp.banco;

public class Cliente {
	
	private int identificador;
	private String nombre;
    private String apellido;
    
	public Cliente(int identificador, String nombre, String apellido) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	private Cliente() {
		super();
	}
    
	public int getIdentificador() {
		return identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	public static class ClienteBuilder{
		
		private int identificador = 0;
		private String nombre = "";
	    private String apellido = "";
	    
		public ClienteBuilder setIdentificador(int identificador) {
			this.identificador = identificador;
			return this;
		}
		
		public ClienteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		public ClienteBuilder setApellido(String apellido) {
			this.apellido = apellido;
			return this;
		}
		
		public Cliente build(){
			assert this.nombre != null;
			assert this.apellido != null;
			assert this.identificador >0;
			
			Cliente c = new Cliente();
			c.identificador = this.identificador;
			c.nombre = this.nombre;
			c.apellido = this.apellido;
			
			return c;
		}
		

	}
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}
}
