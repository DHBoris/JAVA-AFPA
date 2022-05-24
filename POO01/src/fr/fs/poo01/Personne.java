package fr.fs.poo01;

import java.util.Objects;

public class Personne {
	private String nom;
	private String prenom;
	private boolean permis;

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom.toUpperCase();
		this.prenom = OutilsChaine.toNompPropre(prenom);
		permis = false;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean isPermis() {
		return permis;
	}

	public void validerPermis() {
		permis = true;
	}

	public void suspendrePermis() {
		permis = false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(nom, other.nom)
				&& Objects.equals(prenom, other.prenom);
	}






}
