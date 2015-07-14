package Main;

import java.util.Scanner;
import java.util.Vector;

import Armas.ArmaTipo;
import Luchador.Arquero;
import Luchador.FabArquero;
import Luchador.FabGladiador;
import Luchador.FabricaLuchador;
import Luchador.Gladiador;
import Luchador.Luchador;
import Luchador.LuchadorTipo;


public class Main {

	public static Vector<Gladiador> vg = new Vector<Gladiador>();
	public static Vector<Arquero> va = new Vector<Arquero>();
	public static void main(String[] args) {
		CrearLuchador(1);
		CrearLuchador(2);
	}
	private static void CrearLuchador(int i) {
		Luchador Lr = null;
		ArmaTipo tipo = null;
		String nombre = null;
		switch(i){
			case 1:
				nombre = "Gladiador";
				tipo = ArmaTipo.Larga;
				Lr = new Gladiador(new FabGladiador(), tipo, nombre);
				vg.add((Gladiador) Lr);
				break;
			case 2:
				nombre = "Arquero";
				tipo = ArmaTipo.ArcoLargo;
				Lr = new Arquero(new FabArquero(), tipo, nombre);
				va.add((Arquero) Lr);
				break;
		}
	}
}
