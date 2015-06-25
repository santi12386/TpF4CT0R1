package Main;

import java.util.Scanner;
import java.util.Vector;

import Luchador.FabArquero;
import Luchador.FabGladiador;
import Luchador.FabricaLuchador;


public class Main {

	public static Vector<FabGladiador> vg = new Vector<FabGladiador>();
	public static Vector<FabArquero> va = new Vector<FabArquero>();
	
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
			for(FabGladiador luchador:vg)
			{
				System.out.println(luchador.toString());
			}
		}
		else
		{
			for(FabArquero luchador1:va)
			{
				System.out.println(luchador1.toString());
			}
		}
		
	}
	private static void CrearLuchador(int i) {
		Scanner sc = new Scanner(System.in);
		FabricaLuchador Lr = null;
		String tipo = null;
		tipo=SelectTipo();
		if(tipo==null){
			return;
		}
		System.out.println("Escriba el nombre: ");
		String nombre = sc.next();
		switch(i){
			case 1:
				Lr = new FabGladiador(nombre, tipo,vg);
				break;
			case 2:
				System.out.println(tipo);
				Lr = new FabArquero(nombre, tipo,va);
				break;
		}
	}
	private static String SelectTipo() {
		Scanner sc = new Scanner(System.in);
		int tipo = 0;
		String tip;
		while(true){
			System.out.println("Elija tipo de arma: 1, 2, 3");
			try{
				tipo = sc.nextInt();
			}catch(Exception e){
				System.out.println("Opcion invalida");
				return null;
			}
			if((tipo<1) || (tipo>3)){
				System.out.println("Opcion invalida");
				return null;
			}
			tip=Integer.toString(tipo);
			return tip;
		}
	}
}
