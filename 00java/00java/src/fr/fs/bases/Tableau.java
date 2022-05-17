package fr.fs.bases;

import java.util.Random;

public class Tableau {
	
private static Random alea = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] autresValeurs = new int [6];
		for (int i = 0; i < autresValeurs.length; i++) {
			autresValeurs[i] = alea.nextInt(49) + 1 ;
			System.out.println(autresValeurs[i]);
		}
		
		}
		
}
