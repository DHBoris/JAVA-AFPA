package fr.fs.bases;

import java.util.Scanner;

public class Hello {
	private static Scanner monScanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Choissisez un nombre :");
		
		int a = monScanner.nextInt(); 
		System.out.print("Choissisez un nombre :");
		int b = monScanner.nextInt();
		System.out.println("premier entier :  " + a );
		System.out.println("Deuxième entier :  " + b );
		// TODO Auto-generated method stub
		int resultat = a * b;
		System.out.printf(" %d * %d = %d", a, b , resultat);
	}

}
