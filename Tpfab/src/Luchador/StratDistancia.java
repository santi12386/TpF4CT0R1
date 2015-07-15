package Luchador;

import Armas.ArmaTipo;

public class StratDistancia extends Strategy {

	public void setArma(Luchador atacante) {
		if(atacante instanceof Gladiador){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.Lanza);
		}else if(atacante instanceof Arquero){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.ArcoLargo);
		}
	}

}
