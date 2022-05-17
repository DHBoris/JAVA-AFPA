package fr.fs.bases;

import java.util.Scanner;

public class avenir {
	private static Scanner monScanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h;
		int m;
		int s;
		System.out.println("H : ");
		h = monScanner.nextInt();
		System.out.println("M : ");
		m = monScanner.nextInt();
		System.out.println("S : ");
		s = monScanner.nextInt();
		
		 if (++s == 60)
         {
             s = 0;
             if (++m == 60)
             {
             m = 0;
             if (++h == 24)
                 h = 0;
             }
         }
		   System.out.println("Dans une seconde il sera : "+ h + ":" + m + ":" + s);
	}

}
