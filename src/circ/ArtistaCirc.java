package circ;

public abstract class ArtistaCirc {
	private String nom;
	private int edat;
	private TipusActuacio TipusActuacio;
	
	public ArtistaCirc(String nom, int edat, TipusActuacio tipusActuacio) {
		this.setNom(nom);
		this.setEdat(edat);
		this.setTipusActuacio(tipusActuacio);
	}
	
	//metode que haura de ser implementat per les classes filles
	public abstract void realitzarActuacio();

	
	//metode per imprimir la informacio
	@Override
	public String toString() {
		return "\nNom: " + nom + "\nEdat: " + edat + "\nTipus Actuacio: " + TipusActuacio;
	}
	
	//metode per comparar dos artistes, si el nom i la edat coincideixen sera true
	public boolean equals(Object a) {
		boolean iguals = false;
		
		ArtistaCirc o = (ArtistaCirc)a;
		
		if(this == o) {
			iguals = true;
		}
		return iguals;
	}

	
//	GETTERS - SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public TipusActuacio getTipusActuacio() {
		return TipusActuacio;
	}

	public void setTipusActuacio(TipusActuacio tipusActuacio) {
		TipusActuacio = tipusActuacio;
	}
	
}
