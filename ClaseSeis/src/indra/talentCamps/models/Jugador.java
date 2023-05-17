package indra.talentCamps.models;

public abstract class Jugador {
	
	private String nombre;
	private int hp;
	private int fuerza;
	private int destreza;
	private int modFuerza;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		hp = 50;
		fuerza = 50;
		destreza = 50;
		modFuerza = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuerza() {
		return fuerza;
	}

	protected void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	protected void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	protected void setModFuerza(int modFuerza) {
		this.modFuerza = modFuerza;
	}
	
	public void accion(Jugador enemigo) {}
	
	public boolean estaVivo() {
		if (this.getHp()>0) 
			return true;
		return false;
	}
	
	public void finalizarTurno() {
		this.setModFuerza(0);
	}
	
	@Override 
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nuestro personaje es %s, llamado %s \n Tiene una salud: %d \n Tiene una destreza: %d \n Tiene fuerza : %d"  ,
                this.getClass().getSimpleName(),
        		this.nombre,
                this.hp,
                this.destreza,
                this.fuerza);
    } 

}
