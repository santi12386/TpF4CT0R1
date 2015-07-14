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
		while(true){
			Menu();
		}
	}
	public static void Menu(){
		Scanner sc = new Scanner(System.in);
		int opc=0;
		while(opc!=4){
			System.out.println("1) Crear Gladiador");
			System.out.println("2) Crear Arquero");
			System.out.println("3) Ver Gladiadores");
			System.out.println("4) Ver Arqueros");
			System.out.println("5) Salir");
			opc = sc.nextInt();
			switch(opc){
			case 1:
				CrearLuchador(1);
				break;
				
			case 2:
				CrearLuchador(2);
				break;
				
			case 3:
				VerLuchador(1);
				break;
				
			case 4:
				VerLuchador(2);
				break;
				
			case 5:
				System.exit(1);
				
			default:
				System.out.println("Opcion invalida!");
				
			}
		}
	}
	private static void VerLuchador(int i) {
		if(i==1)
		{
			for(Gladiador luchador:vg)
			{
				System.out.println(luchador.nombre());
			}
		}
		else
		{
			for(Arquero luchador1:va)
			{
				System.out.println(luchador1.toString());
			}
		}
		
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
		System.out.println("Escriba el nombre: ");
		String nombre = sc.next();
		switch(i){
			case 1:
				Lr = new Gladiador(new FabGladiador(), tipo, nombre);
				break;
			case 2:
				Lr = new Arquero(new FabArquero(), tipo, nombre);
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
