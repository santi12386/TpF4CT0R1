package Luchador;

public abstract class Strategy {
	public void atacar(Luchador atacante, Luchador enemigo){
		setArma(atacante);
		System.out.println("Atacando a "+enemigo.toString());
		enemigo.herido(atacante.getArma());
	}
	public abstract void setArma(Luchador atacante);
}
