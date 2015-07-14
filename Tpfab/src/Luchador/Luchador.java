package Luchador;

import Armadura.Armadura;
import Armas.Arma;
import Armas.ArmaTipo;

public abstract class Luchador {
	
	protected Arma arma;
	protected int vida;
	protected Armadura armadura;
	protected FabricaLuchador fabrica;
	protected String nombre;
	
	public abstract void setear(ArmaTipo tipo);

}
