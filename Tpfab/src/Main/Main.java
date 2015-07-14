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

	public static Vector<FabGladiador> vg = new Vector<FabGladiador>();
	public static Vector<FabArquero> va = new Vector<FabArquero>();
	
	public static void main(String[] args) {
		CrearLuchador(1);
		CrearLuchador(2);
	}
	private static void CrearLuchador(int i) {
		Scanner sc = new Scanner(System.in);
		Luchador Lr = null;
		ArmaTipo tipo = null;
		if(i==1)
			tipo=SelectTipo(i);
		if(tipo==null){
			return;
		}
		switch(i){
			case 1:
				String nombre = "Gladiador";
				Lr = new Gladiador(new FabGladiador(), nombre);
				break;
			case 2:
				String nombre2 = "Arquero";
				Lr = new Arquero(new FabArquero(), nombre2);
				break;
		}
	}
	private static ArmaTipo SelectTipo(int i) {
		Scanner sc = new Scanner(System.in);
		int tipo = 0;
		ArmaTipo tip=null;
		while(tipo==0){
			System.out.println("Elija tipo de arma: 1, 2, 3");
			try{
				tipo = sc.nextInt();
			}catch(Exception e){
				System.out.println("Opcion invalida");
				tipo=0;
			}
			if((tipo<1) || (tipo>3)){
				System.out.println("Opcion invalida");
				tipo=0;
			}
		}
		if(i==2){
			switch(tipo){
			case 1:
				tip=ArmaTipo.ArcoLargo;
				break;
			case 2:
				tip=ArmaTipo.Crossbow;
				break;
			case 3:
				tip=ArmaTipo.Shortbow;
				break;
			}
		}else if(i==1){
			switch(tipo){
			case 1:
				tip=ArmaTipo.Larga;
				break;
			case 2:
				tip=ArmaTipo.Curva;
				break;
			case 3:
				tip=ArmaTipo.DobleFilo;
				break;
			}
		}
		return tip;
	}
}
