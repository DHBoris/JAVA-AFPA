package fr.fs.bases;

public class Multiplication {
	private static final int NB_BLOCS = 5;
	private static final int NB_LIGNES = 10;
	private static final int NB_COLONNES = 6;
	public static void main(String[] args)
	{
		afficherTable();
	}
	
	
	private static void afficherTable() {
		// Pour chaque bloc de 1 à NB_BLOCS 
		for (byte bloc = 1; bloc <= NB_BLOCS; bloc++)
		{
			afficherLignes(bloc);
			// On fait un saut de ligne à la fin du bloc
			System.out.println();
		}
	}


	private static void afficherLignes(byte bloc) {
		// pour chaque ligne de 1 à NB_LIGNES
		for (byte ligne = 0; ligne <= NB_LIGNES; ligne++)
		{
			afficherColonnes(bloc, ligne);
			// On fait un saut de ligne à la fin de la ligne
			System.out.println();
		}
	}


	private static void afficherColonnes(byte bloc, byte ligne) {
		// pour chaque colonne de 1 à NB_COLONNES
		for (byte colonne = 1; colonne <= NB_COLONNES; colonne++)
		{
			// On calcul le numéro de la table en fonction 
			// du numéro de bloc et de la colonne
			byte table = (byte) ((bloc - 1) * NB_COLONNES + colonne);
			// On affiche la ligne de la table
			System.out.printf("%2d * %2d = %3d     ", table, ligne, table * ligne);
		}
	}
}
