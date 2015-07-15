package Luchador;

import Armas.ArmaTipo;

public class StratCerca extends Strategy{

	public void setArma(Luchador atacante) {
		if(atacante instanceof Gladiador){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.Curva);
		}else{
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.Shortbow);
		}
	}

}
