package com.btssio.ozenne.chapitre1;

public class Vehicule {
	
	private String immatriculation;
	private String modele;
	private int nbKmCompteur;
	private float prix;
	
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getImmatriculation() {
		return immatriculation;
	}
	public int getNbKmCompteur() {
		return nbKmCompteur;
	}

	public void arreter() {
		System.out.println("Stop -"+ this.modele +"s'arrête");
		
	}
	
	public void demarrer() {
		System.out.println("Go -"+ this.modele +"démarre");
		
	}


	public void seDeplacer(int nb) {
		System.out.println( this.modele +"se déplace de "+ nb+ " km");
		
	}

/**
 * Cobstructeur de la classe 
 * @param immatriculation du véhicule
 * @param modele du véhicule
 * @param nbKmCompteur lors de l'achat (création de l'objet)
 * @param prix TTC du véhicule
 */

	public Vehicule(String immatriculation, String modele, int nbKmCompteur, float prix) {
		super();
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.nbKmCompteur = nbKmCompteur;
		this.prix = prix;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicule monVehicule = new Vehicule("ZER 31 HJ","Peugeot 2008", 0, 45000);
	}

}
