package Luchador;

import java.util.Scanner;
import java.util.Vector;

import Armadura.ArmPesada;
import Armas.Curva;
import Armas.DobleFilo;
import Armas.Espada;
import Armas.Larga;



public class FabGladiador implements FabricaLuchador{
	
	private String nombre;
	private Espada espada;
	private ArmPesada armp;
	
	public FabGladiador(String nombre, String tipo,Vector vg){
		this.nombre=nombre;
		if((this.espada=PonerArma(tipo))==null){
			System.out.println("Error");
		}
		this.armp=PonerArmadura();
		vg.add(this);
	}
	
	public Espada PonerArma(String tipo){
		
		switch(tipo){
			case "1":
				this.espada=new DobleFilo();
				break;
			case "2":
				this.espada=new Larga();
				break;
			case "3":
				this.espada=new Curva();
				break;
			default:
				System.out.println("No existe ese tipo");
				espada = null;
				
		}
		return espada;	
	}
	public ArmPesada PonerArmadura(){
		
		ArmPesada armp1=new ArmPesada();
		return armp1;
		
	}
	public String toString()
	{
		return nombre+" "+espada.tipo+" "+"Armadura Pesada";
		
	}


}
