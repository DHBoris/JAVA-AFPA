package fr.bd.geometry;

public class Afficher {
	
	private Afficher()
	{
		
	}

	
	public static void afficher (Point p1, Point p2) {
		System.out.printf("%s et %s",p1,p2);
		if (p1.equals(p2))
			System.out.printf(" sont un seul et m�me point.");
		else 
		System.out.printf(" sont deux points distincts.");
		
		System.out.printf("%nCes deux points sont a une distance de : %.2f",p2.calculerDistance(p1));
	}
}
