package Strategy;

import Armas.ArmaTipo;
import Luchador.Arquero;
import Luchador.Gladiador;
import Luchador.Luchador;

public class StratDistancia extends Strategy {

	public void setArma(Luchador atacante) {
		if(atacante instanceof Gladiador){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.Lanza);
		}else if(atacante instanceof Arquero){
			atacante.arma = atacante.fabrica.PonerArma(ArmaTipo.ArcoLargo);
		}
	}

}
