package indra.talentCamps.models;

public class Sacer extends Jugador{
	
	public Sacer(String nombre) {
		super(nombre);
	}
	
	@Override
	public void accion(Jugador enemigo) {
		System.out.format("%s cura a %s por %d puntos de daño\n",
				this.getNombre(),
				enemigo.getNombre(),
				this.getDestreza());
		enemigo.setHp(enemigo.getHp() + this.getDestreza());
	}

}
