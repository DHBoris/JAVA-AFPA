package fr.fs.bases;

import java.util.Scanner;

public class NombrePremier {
	private static Scanner monScanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("nombre :");
		int a = monScanner.nextInt();
		CalculNombrePremier(a);
	}

	private static void CalculNombrePremier(int a) {
		int tab[] = new int[a];
		int compt = 0;
		int i = 2;
	    int nbp;
		double reste;
		double racine;
		do {
			racine = Math.sqrt(i);
			reste = i%racine;
			nbp = i;

			if (reste == 0) {
				tab[compt] = nbp;
				compt++;
				
					
				}
			
			i++;
		} while (compt < tab.length);
		for (int k = 0; k < tab.length - 1; k++) {

			System.out.println(tab[k]);
		}

	}
}