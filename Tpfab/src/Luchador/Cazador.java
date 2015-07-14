package Luchador;

import Armas.ArmaTipo;

public class Cazador extends Luchador{
	
	public Cazador(FabricaLuchador fabrica){
		this.fabrica = fabrica;
	}

	public void setear(ArmaTipo tipo) {
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
	
}
