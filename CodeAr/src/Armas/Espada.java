package Armas;


public class Espada implements Arma {
	
	public int daño;
	public String tipo;
	public int peso;
	
	public Espada(int daño, String tipo, int peso){
		this.daño=daño;
		this.tipo = tipo;
		this.peso = peso;
	}
}
