package fr.fs.bases;

import java.util.Scanner;

public class While {
	private static Scanner monScanner = new Scanner(System.in);

	public static void main(String[] args) {
		String cafe;
		do
		 {

			System.out.println("Voulez vous un cafe : ");
			cafe = monScanner.nextLine();

		}while (!cafe.equalsIgnoreCase("O") && !cafe.equalsIgnoreCase("N"));

		if (cafe.equalsIgnoreCase("o")) {
			System.out.println("Tenez votre café");
		} else {
			System.out.println("tant pis");
		}

	}

}
