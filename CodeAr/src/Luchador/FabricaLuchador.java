package Luchador;
import Armas.Arma;
import Armadura.Armadura;


public interface FabricaLuchador{
	public Arma PonerArma(String tipo);
	public Armadura PonerArmadura();
}
