package fr.bd.geometry;

import java.util.Objects;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void tHorizontale(int valeur)
	{
		x+=valeur;
	}
	public void tVerticale(int valeur)
	{
		y+=valeur;
	}
	
	public double calculerDistance(Point other)
	{
		double aCarre = Math.pow(x - other.x,2);
		double bCarre = Math.pow(y - other.y,2);
		return Math.sqrt(aCarre+ bCarre);
		
	}
	
	private double carre(double valeur) {
		return valeur * valeur;
	}
	
	public double calculerDistanceCarreAvec(Point autrePoint) {
		double aCarre = carre(x - autrePoint.x);
		double bCarre = carre(y - autrePoint.y);
		return aCarre + bCarre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Point [" + x + ", " + y + "]";
	}

}
