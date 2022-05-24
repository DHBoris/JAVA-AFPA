package fr.fs.poo01;

public class Main {

    public static void main(String[] args) {

	Voiture maVoiture = new Voiture("renault", "grand sc�nic", "rouge", 5, 145);
	maVoiture.setCouleur("BLEUE");

	Personne lui = new Personne("doe", "john");
	Personne encoreLui = new Personne("doe", "john");

	System.out.println("Lui        : " + lui + " " +lui.hashCode());
	System.out.println("Encore Lui : " + encoreLui);
	
	if ( lui.equals(encoreLui) )
		System.out.println("Egal");
	else
		System.out.println("Diff�rent");
	
	
	Personne elle = new Personne("doe", "jane");
	Personne leurFilsAine =new Personne("doe", "alban"); 
	Personne leurFilsCadet =new Personne("doe", "mika"); 
	Personne leurFillesAinee =new Personne("doe", "aiki"); 
	Personne leurFillleCadette =new Personne("doe", "laura"); 
	lui.validerPermis();
	
	maVoiture.setConducteur(lui);

		
	maVoiture.monter(elle);
	maVoiture.monter(elle);
	maVoiture.monter(elle);
	maVoiture.monter(elle);
	maVoiture.monter(leurFillesAinee);
	maVoiture.monter(leurFillleCadette);
	maVoiture.monter(leurFilsAine);
	maVoiture.monter(leurFilsCadet);
	maVoiture.descendre(leurFillleCadette);
	
	Afficher.afficher(maVoiture);
	maVoiture.monter(leurFilsCadet);
	Afficher.afficher(maVoiture);
    }

}
