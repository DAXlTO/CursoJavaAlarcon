package indra.talentCamps.models;

public class Guerrero extends Jugador{

	public Guerrero(String nombre) {
		super(nombre);
	}
	
	@Override
	public void accion(Jugador enemigo) {
		System.out.format("%s ataca a %s y hace %d de daño\n",
				this.getNombre(),
				enemigo.getNombre(),
				this.getFuerza());
		enemigo.setHp(enemigo.getHp() - this.getFuerza());
	}
}
