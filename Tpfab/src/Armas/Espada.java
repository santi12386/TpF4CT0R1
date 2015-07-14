package Armas;


public class Espada implements Arma {
	
	public int daño;
	public int peso;
	public String tipo;
	
	public Espada(int daño, String tipo, int peso){
		this.daño=daño;
		this.tipo = tipo;
		this.peso = peso;
	}
}
