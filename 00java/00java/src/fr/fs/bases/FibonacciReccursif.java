package fr.fs.bases;

public class FibonacciReccursif {

	public static void main(String[] args) {
		long n = 48;
		long t = System.nanoTime();
		System.out.printf("Fib(%d) = %d   calculé en : %12d nanosecondes%n", n, fibonacci(n),System.nanoTime()-t);
		t = System.nanoTime();
		System.out.printf("Fib(%d) = %d   calculé en : %12d nanosecondes%n", n, fibonacciReccursif(n),System.nanoTime()-t);
		t = System.nanoTime();
		System.out.printf("Fib(%d) = %d   calculé en : %12d nanosecondes%n", n, fibonacciReccursifTerminal(n,0,1),System.nanoTime()-t);
	}

	private static long fibonacci(long n) {
		long moinsDeux = 0;
		long moinsUn = 1;
		long resultat = 1;
		if (n < 2)
			return n;
		for (int i = 2; i <= n; i++) {
			resultat = moinsDeux + moinsUn;
			moinsDeux = moinsUn;
			moinsUn = resultat;
		}
		return resultat;
	}

	private static long fibonacciReccursif(long n) {
		if (n < 2)
			return n;
		return fibonacciReccursif(n - 2) + fibonacciReccursif(n - 1);
	}
	
	
	
	
	
	private static long fibonacciReccursifTerminal(long n, long moinsDeux,long moinsUn) {	
		if (n == 0) return moinsDeux;
		if (n == 1) return moinsUn;
		return fibonacciReccursifTerminal(n-1, moinsUn, moinsUn+moinsDeux);
	}
	
}