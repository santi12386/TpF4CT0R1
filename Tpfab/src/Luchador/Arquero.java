package Luchador;

import Armas.Arco;
import Armas.ArmaTipo;


public class Arquero extends Luchador{
	
	public Arquero(FabricaLuchador fabrica, ArmaTipo tipo, String nombre){
		System.out.println("\nCreando FabArquero");
		this.fabrica = fabrica;
		this.setear(tipo);
		this.vida = 10;
		this.nombre = nombre;
		this.estado = true;
		System.out.println("Arquero creado");
	}

	public void setear(ArmaTipo tipo) {
		System.out.println("Seteando luchador");
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
	public String toString(){
		return "Arquero "+this.nombre;
	}
}
