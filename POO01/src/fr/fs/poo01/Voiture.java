package fr.fs.poo01;

public class Voiture {

	private String marque;
	private String modele;
	private String couleur;
	private int nbPlaces;
	private int vitesseMax;
	private int vitesseCourante;
	private Personne conducteur;
	private Personne[] passagers;

	public Voiture(String marque, String modele, String couleur, int nbPlaces,
			int vitesseMax) {
		super();
		this.marque = marque.toUpperCase();
		this.modele = OutilsChaine.toNompPropre(modele);
		this.couleur = OutilsChaine.toNompPropre(couleur);
		this.nbPlaces = nbPlaces;
		this.vitesseMax = vitesseMax;
		vitesseCourante = 0;
		passagers = new Personne[nbPlaces - 1];
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = OutilsChaine.toNompPropre(couleur);
	}

	public String getMarque() {
		return marque;
	}

	public String getModele() {
		return modele;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void accelerer(int valeur) {

		vitesseCourante = Math.min(vitesseMax, vitesseCourante + valeur);
	}

	public int getVitesseCourante() {
		return vitesseCourante;
	}

	public Personne getConducteur() {
		return conducteur;
	}

	public void setConducteur(Personne conducteur) {
		if (conducteur.isPermis() && vitesseCourante == 0)
			this.conducteur = conducteur;
	}

	public Personne[] getPassagers() {
		return passagers;
	}

	public void monter(Personne personne) {
		if (conducteur != null && vitesseCourante == 0) {
			int position = calculerPositionVide();
			if (!isIn(personne) && position != -1)
				passagers[position] = personne;
		}
	}

	private boolean isIn(Personne personne) {
		if (conducteur.equals(personne))
			return true;
		return calculerPosition(personne) != -1 ;
	}

	public void descendre(Personne personne) {
		if (vitesseCourante == 0) {
			int position = calculerPosition(personne);
			if (position != -1)
				passagers[position] = null;
		}
	}

	private int calculerPosition(Personne personne) {
		int resultat = -1;
		int i = 0;
		while (resultat == -1 && i < passagers.length) {
			if (passagers[i] != null && passagers[i].equals(personne)) {
				resultat = i;
			}
			i++;
		}
		return resultat;
	}

	private int calculerPositionVide() {
		int resultat = -1;
		int i = 0;
		while (resultat == -1 && i < passagers.length) {
			if (passagers[i] == null) {
				resultat = i;
			}
			i++;
		}
		return resultat;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", couleur="
				+ couleur + ", vitesseCourante=" + vitesseCourante + "]";
	}

}
