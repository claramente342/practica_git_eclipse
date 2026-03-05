package mascota;



public class Lloro {
	private String nomLloro;
	private String color;
	
	
	public Lloro() {
		
	}
	
	public Lloro(String nom, String color) {
		this.setNomLloro(nom);
		this.setColor(color);
	}

	
	
//	GETTERS -- SETTERS
	public String getNomLloro() {
		return nomLloro;
	}

	public void setNomLloro(String nom) {
		this.nomLloro = nom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
