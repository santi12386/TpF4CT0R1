package Luchador;


import java.util.Random;

import javax.xml.bind.ValidationEvent;

import Armadura.ArmLigera;
import Armadura.ArmPesada;
import Armadura.Armadura;
import Armas.Arco;
import Armas.Arma;
import Armas.ArmaTipo;
import Armas.Espada;
import Main.Main;

public abstract class Luchador {
	
	protected Arma arma;
	protected int vida;
	protected Armadura armadura;
	protected FabricaLuchador fabrica;
	public String nombre;
	
	public abstract void setear(ArmaTipo tipo);
	
	public void herido(Arma a){
		int def;
		if(armadura instanceof ArmLigera)
		 {
			ArmLigera armad=(ArmLigera)armadura;
			def=armad.resistencia;
		 }
		else{
			ArmPesada armad=(ArmPesada)armadura;
			def=armad.resistencia;
		}
		 if( arma instanceof Espada) {
			 
			 
					 Espada arm=(Espada)arma;
					 this.vida=this.vida-(arm.daño-def);
		 }
			  else if( arma instanceof Arco) {
				  Arco arc=(Arco)arma;
					 this.vida=this.vida-(arc.daño-def);
			  }
	}
	
	public Arma getArma(){
		return this.arma;
	}
	public int visualizarObjetivo(){
		Random random = new Random();
		int i=0, j=0;
		Luchador lr = null;
		i = random.nextInt(2)+1;
		
		if(this instanceof Gladiador){
			if(((Main.va.size())+(Main.va.size()))==1){
				System.out.println("No hay mas luchadores");
			}
		}else if(((Main.va.size())+(Main.va.size()))==1){
			System.out.println("No hay mas luchadores");
		}
		
		switch(random.nextInt(1)){
		case 0:
			lr = Main.va.get(random.nextInt(Main.va.size()));
			System.out.println("Se encontro un luchador");
			break;
			
		case 1:
			lr = Main.vg.get(random.nextInt(Main.va.size()));
			System.out.println("Se encontro un luchador");
			if
			break;
			
		}
		System.out.println("El objetivo es");
	}
}
