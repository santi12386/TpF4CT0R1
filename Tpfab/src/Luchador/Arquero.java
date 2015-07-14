package Luchador;

import Armas.Arco;
import Armas.ArmaTipo;


public class Arquero extends Luchador{
	
	public Arquero(FabricaLuchador fabrica, ArmaTipo tipo, String nombre){
		this.fabrica = fabrica;
		this.setear(tipo);
		this.nombre = nombre;
	}

	public void setear(ArmaTipo tipo) {
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
}
