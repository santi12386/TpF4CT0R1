package Luchador;

import Armas.ArmaTipo;
import Armas.Espada;

public class Gladiador extends Luchador{

	public Gladiador(FabricaLuchador fabrica, ArmaTipo tipo, String nombre){
		System.out.println("\nCreando FabGladiador");
		this.fabrica = fabrica;
		this.setear(tipo);
		this.vida = 250;
		this.nombre = nombre;
		this.estado = true;
		System.out.println("Gladiador creado");
	}

	public void setear(ArmaTipo tipo) {
		System.out.println("Seteando luchador");
		this.arma = fabrica.PonerArma(tipo);
		this.armadura=fabrica.PonerArmadura();
	}
	public String toString(){
		return "Gladiador "+this.nombre;
	}
	
}
