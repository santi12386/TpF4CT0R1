package Luchador;

import java.util.Scanner;
import java.util.Vector;

import Armadura.ArmLigera;
import Armas.Arco;
import Armas.ArcoLargo;
import Armas.Crossbow;
import Armas.Shortbow;



public class FabArquero implements FabricaLuchador{
	
	private String nombre;
	private Arco arco;
	private ArmLigera arml;
	
	public FabArquero(String nombre, String tipo,Vector va){
		this.nombre=nombre;
		if((this.arco=PonerArma(tipo))==null){
			System.out.println("Error");
		}
		this.arml=PonerArmadura();
		va.add(this);
	}
	
	public Arco PonerArma(String tipo){
		
		switch(tipo){
			case "1":
				this.arco=new ArcoLargo();
				break;
			case "2":
				this.arco=new Shortbow();
				break;
			case "3":
				this.arco = new Crossbow();
				break;
			default:
				System.out.println("No existe ese tipo");
				arco = null;
				
		}
		return arco;
		
	}
	public ArmLigera PonerArmadura(){
		ArmLigera arml1=new ArmLigera();
		return arml1;
		
	}
	public String toString()
	{
		return nombre+" "+arco.tipo+" "+"Armadura Ligera";
		
	}
}
