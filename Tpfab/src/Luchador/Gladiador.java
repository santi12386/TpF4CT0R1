package Luchador;

import Armas.ArmaTipo;
import Armas.Espada;

public class Gladiador extends Luchador{
	
	public Gladiador(FabricaLuchador fabrica, ArmaTipo tipo, String nombre){
		this.fabrica = fabrica;
		this.setear(tipo);
		this.nombre = nombre;
	}

	public void setear(ArmaTipo tipo) {
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
	
}
