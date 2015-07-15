package Luchador;

import Armadura.ArmLigera;
import Armadura.ArmPesada;
import Armadura.Armadura;
import Armas.Arco;
import Armas.Arma;
import Armas.ArmaTipo;
import Armas.Espada;

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
}
