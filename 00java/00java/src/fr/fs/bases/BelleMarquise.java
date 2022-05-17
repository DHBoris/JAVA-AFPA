package fr.fs.bases;

public class BelleMarquise {
	private static String[] phrase = { "belle marquise", "vos beaux yeux", "me font", "mourir d'amour" };
	private static int cpt = 0;

	public static void main(String[] args) {
		afficherPhrase();
	}

	private static void afficherPhrase() {
		for (String partie1 : phrase) {
			afficherPartie2(partie1);
		}

	}

	private static void afficherPartie2(String partie1) {
		for (String partie2 : phrase) {
			if (!partie2.equals(partie1))
				for (String partie3 : phrase) {
					if (!partie3.equals(partie1) && !partie3.equals(partie2))
						for (String partie4 : phrase) {
							if (!partie4.equals(partie1) && !partie4.equals(partie2) && !partie4.equals(partie3))
								for (String partie5 : phrase) {
									if (!partie5.equals(partie1) && !partie5.equals(partie2)
											&& !partie5.equals(partie3) && !partie5.equals(partie4))
										System.out.printf("%3d - %s %s %s %s %s%n",++cpt, partie1, partie2, partie3, partie4,
												partie5);
								}
						}
				}
		}
	}

}