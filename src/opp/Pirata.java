package opp;

import java.util.Scanner;
import mascota.Lloro;

class Pirata extends Lloro{
	String nom;
	protected String nomVaixell;
	private int salut;
	private int ampolles;
	private double qTresors;
	private boolean capita;
	static String flota;
	static int comptadorPirates;
	
	
	public Pirata() {
		Pirata.flota = "Tripulacio 1";
		this.nom = "Guybrush Threepwod";
		this.nomVaixell = "El Mono de Mar";
		this.salut = 50;
		this.ampolles = 5;
		this.qTresors = 1000;
		this.capita = true;
		Pirata.comptadorPirates += 1;
		this.getNomLloro();
		this.getColor();
	}
	
	public void assignaLloro() {
		Scanner sc = new Scanner(System.in);
		
		
		if(this.isCapita()) {
			System.out.print(this.getNom() + ": Un capitan que se precie debe tener siempre un loro. Proporciona el nombre del loro: ");
			this.setNomLloro(sc.next());
			System.out.print("\nProporciona el color del loro: ");
			this.setColor(sc.next());
			
		}
	}


	
	
	
	public String imprimirPirata() {
		
		return "Nombre: " + this.getNom() + 
						"\nBarco: " + this.getNomVaixell() +
						"\nSalud: " + this.getSalut() + " HP" +
						"\nBotellas de Grog: " + this.getAmpolles() +
						"\nTesoro: " + this.getqTresors() + " doblones"
		 + (this.isCapita() ? ("\n" + this.getNom() + " es el capitan de " + this.getNomVaixell())  +"\nSu loro se llama "+ this.getNomLloro() + " y es de color " + this.getColor(): "")
		 ;
		
	}
	
	
	
//	GETTERS -- SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomVaixell() {
		return nomVaixell;
	}

	public void setNomVaixell(String nomVaixell) {
		this.nomVaixell = nomVaixell;
	}

	public int getSalut() {
		return salut;
	}

	public void setSalut(int salut) {
		this.salut = salut;
	}

	public int getAmpolles() {
		return ampolles;
	}

	public void setAmpolles(int ampolles) {
		this.ampolles = ampolles;
	}

	public double getqTresors() {
		return qTresors;
	}

	public void setqTresors(double qTresors) {
		this.qTresors = qTresors;
	}

	public boolean isCapita() {
		return capita;
	}

	public void setCapita(boolean capita) {
		this.capita = capita;
	}

	public static String getFlota() {
		return flota;
	}

	public static void setFlota(String flota) {
		Pirata.flota = flota;
	}

	public static int getComptadorPirates() {
		return comptadorPirates;
	}

	public static void setComptadorPirates(int comptadorPirates) {
		Pirata.comptadorPirates = comptadorPirates;
	}

}
