package com.btssio.ozenne.chapitre1;

public class Voiture extends Vehicule{
	
	private int nbPortes;

	public Voiture(String immatriculation, String modele, int nbKmCompteur, float prix, int nbPortes) {
		super(immatriculation, modele, nbKmCompteur, prix);
		this.nbPortes = nbPortes;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	
	
	

}
