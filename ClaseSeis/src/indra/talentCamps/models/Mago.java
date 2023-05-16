package indra.talentCamps.models;

public class Mago extends Jugador{
	
	private int ap;
	private int mana;
	
	public Mago(String nombre) {
		super(nombre);
		ap = 10;
		mana = 100;
	}
	
	@Override
	public void accion(Jugador enemigo) {
		System.out.format("%s tira un hechizo a %s y modifica sus stats\n",
				this.getNombre(),
				enemigo.getNombre());
		if(mana>ap) {
			enemigo.setFuerza(enemigo.getFuerza() - this.getFuerza());
			mana -= ap;
		}
	}
}
