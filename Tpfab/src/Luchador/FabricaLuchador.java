package Luchador;
import Armas.Arma;
import Armas.ArmaTipo;
import Armadura.Armadura;


public interface FabricaLuchador{
	public Arma PonerArma(ArmaTipo tipo);
	public Armadura PonerArmadura();
}
