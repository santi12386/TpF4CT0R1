package Luchador;

import java.util.Scanner;
import java.util.Vector;

import Armadura.ArmLigera;
import Armas.Arco;
import Armas.ArcoLargo;
import Armas.Arma;
import Armas.ArmaTipo;
import Armas.Crossbow;
import Armas.Shortbow;



public class FabArquero implements FabricaLuchador{
	
	
	public Arma PonerArma(ArmaTipo tipo){
	
		Arma arm=null;
		
		switch(tipo){
			case ArcoLargo:
				arm=new ArcoLargo();
				break;
			case Shortbow:
				arm=new Shortbow();
				break;
			case Crossbow:
				arm= new Crossbow();
				break;
			default:
				System.out.println("No existe ese tipo");
				arm = null;
				
		}
		return arm;
		
	}
	public ArmLigera PonerArmadura(){
		ArmLigera arml1=new ArmLigera();
		return arml1;
		
	}
}
