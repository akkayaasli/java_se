package arrayDemo;

import java.util.Iterator;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ogr1 ="john";
		String ogr2 ="angie";
		String ogr3 ="sally";
		String ogr4 ="eny";
		
		System.err.println(ogr1);
		System.err.println(ogr2);
		System.err.println(ogr3);
		System.err.println(ogr4);
		
		System.out.println("-----------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "john";
		ogrenciler[1] = "angie";
		ogrenciler[2] = "sally";
		ogrenciler[3] = "emy";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.err.println(ogrenciler[i]);
		}
	}

}
