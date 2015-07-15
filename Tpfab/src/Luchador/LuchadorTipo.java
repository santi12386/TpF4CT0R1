package Luchador;

import java.util.Random;

public enum LuchadorTipo {
	 GLADIADOR,ARQUERO;

	public static LuchadorTipo getRandomLuchador() {
		Random random = new Random();
        return values()[random.nextInt(values().length)];
	}

}
