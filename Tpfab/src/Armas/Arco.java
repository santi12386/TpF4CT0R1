package Armas;


public class Arco implements Arma{
	
	public int da�o;
	protected String tipo;
	public int peso;
	
	public Arco(int da�o, String tipo, int peso) {
		this.da�o=da�o;
		this.tipo = tipo;
		this.peso=peso;
	}
	
}
