package circ;

public class Acrobata extends ArtistaCirc{
	private String especialitat;

	//constructor amb atributs de la classe pare i el seu propi	
	public Acrobata(String nom, int edat, TipusActuacio tipusActuacio, String esp) {
		super(nom, edat, tipusActuacio);
		this.setEspecialitat(esp);
	}
	
	
	//metode abstracte de la classe pare, imprimim la especialitat del acrobata
	@Override
	public void realitzarActuacio() {
		System.out.println("Actuacio de " + this.getEspecialitat());
		
	}
	
	
	//metode per impimir la seva informacio
	@Override
	public String toString() {
		return super.toString() + "\nEspecialitat: " + especialitat;
	}


	//	GETTERS - SETTERS
	public String getEspecialitat() {
		return especialitat;
	}

	public void setEspecialitat(String especialitat) {
		this.especialitat = especialitat;
	}
}
