package Luchador;


import java.util.Random;


import Armadura.ArmLigera;
import Armadura.ArmPesada;
import Armadura.Armadura;
import Armas.Arco;
import Armas.Arma;
import Armas.ArmaTipo;
import Armas.Espada;
import Main.Main;
import Strategy.Strategy;
import Strategy.StratCerca;
import Strategy.StratMedia;
import Strategy.StratDistancia;

public abstract class Luchador{
	
	public Arma arma;
	protected int vida;
	protected Armadura armadura;
	public FabricaLuchador fabrica;
	public String nombre;
	protected Strategy strat;
	protected boolean estado;
	
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
		 if( a instanceof Espada) {
			Espada arm=(Espada)a;
			System.out.println("Con "+arm.tipo);
			this.vida=this.vida-(arm.daño-def);
		}
		else if( a instanceof Arco) {
			Arco arc=(Arco)a;
			System.out.println("Con "+arc.tipo);
			this.vida=this.vida-(arc.daño-def);
		}System.out.println("Dejandolo con "+this.vida+" Puntos de vida");
	}
	
	public Arma getArma(){
		return this.arma;
	}
	public void visualizarObjetivo(){
		Random random = new Random();
		int i=0;
		Luchador lr = null;
		i = random.nextInt(2)+1;
		// VERIFICACIONES
		int h=0;
		for(Gladiador g : Main.vg){
			if(!g.estado){
				h++;
			}
		}
		for(Arquero a : Main.va){
			if(!a.estado){
				h++;
			}
		}
		if(Main.va.size()==0 && Main.vg.size()==1){
			System.out.println("No hay mas luchadores");
			return;
		}else if((Main.va.size()+Main.vg.size())==h+1){
			System.out.println("No hay mas luchadores");
			return;
		}
		//VERIFICACIONES
		switch(random.nextInt(1)){
		case 0:
			if(this instanceof Arquero && Main.va.size() == 1){
				lr = Main.vg.get(random.nextInt(Main.vg.size()));
				if(lr.estado)
					System.out.println("\nSe encontro un luchador");
				else
					lr=null;
				break;
			}
			lr = Main.va.get(random.nextInt(Main.va.size()));
			if((this==lr)||(!lr.estado)){
				visualizarObjetivo();
				return;
			}
			System.out.println("\nSe encontro un luchador");
			break;
			
		case 1:
			if(this instanceof Gladiador && Main.vg.size() == 1){
				lr = Main.va.get(random.nextInt(Main.va.size()));
				if(lr.estado)
					System.out.println("\nSe encontro un luchador");
				else
					lr=null;
				break;
			}
			lr = Main.vg.get(random.nextInt(Main.va.size()));
			if((this==lr)||(!lr.estado)){
				visualizarObjetivo();
				return;
			}
			System.out.println("\nSe encontro un luchador");
			break;
			
		}if(lr!=null)
			System.out.println("El objetivo es el "+lr.toString());
		else
			System.out.println("No se encontraron rivales vivos");
		
		while(lr.vida>0){
			switch(random.nextInt(2)+1){
			case 1:
				System.out.println("\nDistancia actual: 1");
				this.strat = new StratCerca();
				this.strat.atacar(this, lr);
				break;
			case 2:
				System.out.println("\nDistancia actual: 2");
				this.strat = new StratMedia();
				this.strat.atacar(this, lr);
				break;
			case 3:
				System.out.println("\nDistancia actual: 3");
				this.strat = new StratDistancia();
				this.strat.atacar(this, lr);
				break;
			}
		}System.out.println(lr.toString()+" esta muerto");
		for(Gladiador g : Main.vg){
			if(g==lr){
				g.estado = false;
			}
		}
	}
}
