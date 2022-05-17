package fr.fs.bases;

public class SuiteFibonacci {
	public static void main(String args[]) {
		System.out.println(suiteReccursif(48));
		/*int nbr1 = 0;
		int nbr2 = 1;
		int nbr3;
		int count = 10;
		// afficher 0 et 1
		System.out.print(nbr1 + " " + nbr2);

		// La boucle commence par 2 car 0 et 1 sont deja affiches
		for (int i = 2; i < count; ++i) {
			nbr3 = nbr1 + nbr2;
			nbr1 = nbr2;
			nbr2 = nbr3;
			System.out.print(" " + nbr3);
		}*/
		
	}
	private static long suiteReccursif(long n) {
		if (n < 2) 
			return n;
		return suiteReccursif(n - 1 ) + suiteReccursif(n-2);
	}

}