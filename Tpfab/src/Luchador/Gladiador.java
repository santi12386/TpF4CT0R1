package Luchador;

import Armas.ArmaTipo;
import Armas.Espada;

public class Gladiador extends Luchador{
	
	public Gladiador(FabricaLuchador fabrica, String nombre){
		this.fabrica = fabrica;
		this.vida = 25;
		this.nombre = nombre;
	}

	public void setear(ArmaTipo tipo) {
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
	public String toString()
	{
		return "Nombre: "+nombre+" "+"Armadura: Pesada";
		
	}
	
}
