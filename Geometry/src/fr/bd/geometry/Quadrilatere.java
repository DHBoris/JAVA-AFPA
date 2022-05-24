package fr.bd.geometry;

public class Quadrilatere {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	public Quadrilatere(Point pointA, Point pointB, Point pointC, Point pointD) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public boolean isParallelogramme() {
		boolean cotesEgaux = pointA.calculerDistance(pointB) == pointC.calculerDistance(pointD);
		boolean autesCotesEgaux = pointA.calculerDistance(pointD) == pointC.calculerDistance(pointB);
		return cotesEgaux && autesCotesEgaux;
	}

	public boolean isLosange() {
		boolean cotesAdjacentEgaux = pointA.calculerDistance(pointB) == pointB.calculerDistance(pointC);
		return isParallelogramme() && cotesAdjacentEgaux;
	}

	public boolean isRectangle() {
		double aCarre = pointA.calculerDistanceCarreAvec(pointB);
		double bCarre = pointB.calculerDistanceCarreAvec(pointC);
		double cCarre = pointA.calculerDistanceCarreAvec(pointC);
		return isParallelogramme() && (aCarre + bCarre == cCarre);
	}

	public boolean isCarre() {
		return isRectangle() && isLosange();
	}

	@Override
	public String toString() {
		return "Quadrilatere [" + pointA + "," + pointB + "," + pointC + "," + pointD + "]";
	}

}