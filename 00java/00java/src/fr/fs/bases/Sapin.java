package fr.fs.bases;

import java.util.Scanner;

public class Sapin {
	private static Scanner monScanner = new Scanner(System.in);

	public static void main(String[] args) {
		int nbLignes = saisirUnEntier("Combien de lignes", 3, 10);
		for (int ligne = 1; ligne <= nbLignes; ligne++) {
			afficher(" ", nbLignes - ligne);
			afficher ("*",ligne *2 -1);
			System.out.println();
		}
	}

	private static void afficher(String string, int nombre) {

		System.out.print(string.repeat(nombre));
	}

	private static int saisirUnEntier(String message, int min, int max) {
		int reponse = min - 1;
		while (reponse < min || reponse > max) {
			System.out.printf("%s (%d à %d) : ", message, min, max);
			reponse = Integer.parseInt(monScanner.nextLine());
		}
		return reponse;
	}
}