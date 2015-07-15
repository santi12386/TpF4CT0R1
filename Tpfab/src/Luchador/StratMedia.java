package Luchador;

import Armas.ArmaTipo;

public class StratMedia extends Strategy {

	public void setArma(Luchador atacante) {
		if(atacante instanceof Gladiador){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.Larga);
		}else if(atacante instanceof Arquero){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.Crossbow);
		}
	}

}
