package fr.fs.poo01;

public class Afficher {

	private Afficher() {

	}

	public static void afficher(Voiture voiture) {

		System.out.printf("%nMarque           : %s", voiture.getMarque());
		System.out.printf("%nMod�le           : %s", voiture.getModele());
		System.out.printf("%nCouleur          : %s", voiture.getCouleur());
		System.out.printf("%nNb de places     : %s", voiture.getNbPlaces());
		System.out.printf("%nVitesse maxi     : %s", voiture.getVitesseMax());
		System.out.printf("%nVitesse courante : %s",
				voiture.getVitesseCourante());
		System.out.printf("%n%nConducteur -> ");
		afficher(voiture.getConducteur());
		System.out.printf("%nPassagers : %n");
		for (Personne personne : voiture.getPassagers()) {
			System.out.print(" - ");
			afficher(personne);
		}

	}

	public static void afficher(Personne personne) {
		if (personne != null)
			System.out.printf("Nom : %s, Pr�nom : %s , Permis : %s%n",
					personne.getNom(), personne.getPrenom(),
					personne.isPermis());
		else
			System.out.println();
	}
}
