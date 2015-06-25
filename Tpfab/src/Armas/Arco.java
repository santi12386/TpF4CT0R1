package Armas;


public class Arco implements Arma{
	
	public int daño;
	protected String tipo;
	public int peso;
	
	public Arco(int daño, String tipo, int peso) {
		this.daño=daño;
		this.tipo = tipo;
		this.peso=peso;
	}
	
}
