package fr.bd.geometry;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(4,3);
		Point p2 = new Point(0,8);
		Point p3 = new Point(3,0);
		Point p4 = new Point(7,3);
		
		Quadrilatere quadrilatere= new Quadrilatere(p1, p2, p3, p4);
		
		System.out.println("Parallelogramme : " + quadrilatere.isParallelogramme());
		System.out.println("Losange         : " + quadrilatere.isLosange());
		System.out.println("Rectangle       : " + quadrilatere.isRectangle());
		System.out.println("Carré           : " + quadrilatere.isCarre());
		

	}

}
