package com.btssio.ozenne.chapitre1;

public class Bateau extends Vehicule {

	private int nbGiletsDeSauvetage;
	
	
	
	
	
	public Bateau(String immatriculation, String modele, int nbKmCompteur, float prix, int nbGiletsDeSauvetage) {
		super(immatriculation, modele, nbKmCompteur, prix);
		this.nbGiletsDeSauvetage = nbGiletsDeSauvetage;
	}





	public int getNbGiletsDeSauvetage() {
		return nbGiletsDeSauvetage;
	}





	public void setNbGiletsDeSauvetage(int nbGiletsDeSauvetage) {
		this.nbGiletsDeSauvetage = nbGiletsDeSauvetage;
	}


@Override
public void seDeplacer(int nb) {
	System.out.println( this.getModele() +"se déplace de "+ nb+ " noeuds ");
	
}


	

}
