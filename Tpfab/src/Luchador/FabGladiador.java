package Luchador;

import java.util.Scanner;
import java.util.Vector;

import Armadura.ArmPesada;
import Armas.Arma;
import Armas.ArmaTipo;
import Armas.Curva;
import Armas.DobleFilo;
import Armas.Espada;
import Armas.Larga;



public class FabGladiador implements FabricaLuchador{
	
	
	public Arma PonerArma(ArmaTipo tipo){
		Arma arm=null;
		switch(tipo){
			case DobleFilo:
				arm=new DobleFilo();
				break;
			case Larga:
				arm=new Larga();
				break;
			case Curva:
				arm=new Curva();
				break;
			default:
				System.out.println("No existe ese tipo");
				arm = null;
				
		}
		return arm;	
	}
	public ArmPesada PonerArmadura(){
		
		ArmPesada armp1=new ArmPesada();
		return armp1;
		
	}
}
