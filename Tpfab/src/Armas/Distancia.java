package Armas;

import java.util.Random;


public enum Distancia {
	 CERCA,MEDIO,LEJOS;

		public static Distancia getRandomLuchador() {
			Random random = new Random();
	        return values()[random.nextInt(values().length)];
		}	
}
