package circ;

public class Malabarista extends ArtistaCirc{
	private int numPilotes;

	//Constructor amb els atributs de la classe pare i el seu propi
	public Malabarista(String nom, int edat, TipusActuacio tipusActuacio, int pilotes) {
			super(nom, edat, tipusActuacio);
			this.setNumPilotes(pilotes);
		}	

	
	//metode abstracte de la classe pare, imprimim la quantitat de pilotes per als malabars
	@Override
	public void realitzarActuacio() {
		System.out.println("Actuacio de malabars amb " + this.getNumPilotes() + " pilotes");
		
	}
	
	
	//metode per imprimir la seva informacio
	@Override
	public String toString() {
		return super.toString() + "\nPilotes: " + numPilotes;
	}
	
	
	//	GETTERS - SETTERS - amb validacio pilotes
	public int getNumPilotes() {
		return numPilotes;
	}

	//validem que sigui un numero entre 3 i 10
	public void setNumPilotes(int numPilotes) {
		
		if(numPilotes >= 3 && numPilotes <=10) {
			this.numPilotes = numPilotes;
		}else {
			System.out.println("Entre 3 i 10 pilotes");
		}
			
		
	}	
}
