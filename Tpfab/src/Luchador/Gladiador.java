package Luchador;

import Armas.ArmaTipo;

public class Gladiador extends Luchador{
	
	public Gladiador(FabricaLuchador fabrica){
		this.fabrica = fabrica;
	}

	public void setear(ArmaTipo tipo) {
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}

	
}
