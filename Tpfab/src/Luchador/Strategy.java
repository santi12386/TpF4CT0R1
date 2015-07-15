package Luchador;

public abstract class Strategy {
	public void atacar(Luchador atacante, Luchador enemigo){
		setArma(atacante);
		enemigo.herido(atacante.getArma());
	}
	public abstract void setArma(Luchador atacante);
}
