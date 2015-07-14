package Luchador;

import Armas.Arco;
import Armas.ArmaTipo;


public class Arquero extends Luchador{
	
	public Arquero(FabricaLuchador fabrica){
		this.fabrica = fabrica;
		this.vida = 20;
	}

	public void setear(ArmaTipo tipo) {
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
}
