package fr.bd.geometry;

public class Cercle {
	private Point origine;
	private double rayon;

	public Cercle(Point origine, double rayon) {
		this.origine = origine;
		this.rayon = rayon;
	}

	public double calculerCirconference() {
		return 2 * Math.PI * rayon;
	}

	public double calculerAire() {
		return Math.PI * rayon * rayon;
	}

	public boolean isIn(Point p) {
		return p.calculerDistance(origine) <= rayon;
	}

	@Override
	public String toString() {
		return "Cercle[" + origine + "," + rayon + "]";
	}

}