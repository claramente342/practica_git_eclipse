package circ;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		 
		//Cream objectes de les classes
		Acrobata a1 = new Acrobata("Lola", 24, TipusActuacio.ACRÒBACIA, "Volteretas");
		Malabarista m1 = new Malabarista("Nicolas", 35, TipusActuacio.MALABARS, 4);
		PallassoMalabarista pm1 = new PallassoMalabarista("Noelia", 40, TipusActuacio.PALLASSO, 5, "Gracioso");
		
		//imprimim informacio i cridem a les seves funcions
		System.out.println(a1);
		a1.realitzarActuacio();
		
		System.out.println(m1);
		m1.realitzarActuacio();
		
		System.out.println(pm1);
		System.out.println(pm1.realitzarBroma());
		


		//array d'objectes
		ArtistaCirc[] artistes = new ArtistaCirc[] {
		            new Malabarista("Marcos", 30, TipusActuacio.MALABARS, 5),
		            new Acrobata("Maria", 25, TipusActuacio.ACRÒBACIA, "Volteretas"),
		            new PallassoMalabarista("Lucas", 40, TipusActuacio.MALABARS, 4, "Amateur"),
		            new Acrobata("Mario", 28, TipusActuacio.ACRÒBACIA, "Vol"),
		            new Malabarista("Lucia", 31, TipusActuacio.MALABARS, 3)};
		 
		
		//array d'enum DiesSetmana
		DiesSetmana[] dies = DiesSetmana.values();
		
		//array multidimensional (7 dies, 1 actuacio per dia)
		ArtistaCirc[][] cal = new ArtistaCirc[7][1];
		
		//variable per numeros aleatoris
		Random rand = new Random();
		
		
		//recorrem el array dies i el array cal
		//a cal[i][j] li assignem un artista aleatori
		for (int i = 0; i < dies.length; i++) {
            for (int j = 0; j < cal[i].length; j++) {
                cal[i][j] = artistes[rand.nextInt(artistes.length)];
            }
        }
		
		
		//mostrem el calendari i les actuacions
		for(int i = 0;i < dies.length;i++) {
			System.out.println("\n" + dies[i] + ": ");
			for(int j = 0;j<cal[i].length;j++) {
				System.out.print(cal[i][j].getTipusActuacio());
				System.out.print(" == ");
				cal[i][j].realitzarActuacio();
			}
		}
		
		
		
	}
}
