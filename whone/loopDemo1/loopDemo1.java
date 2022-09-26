package loopDemo1;

import java.util.Iterator;

public class loopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for
		for (int i = 2; i < 10; i+=2) {
			
			System.err.println(i);
			
		}
		System.err.println("Final For Loop");
		
		//while
		
		int i=1;
		while(i<10)
		{
			System.err.println(i);
			i++;
		}
		System.err.println("Final While Loop");
		
		//do-while
		int j=100;
		do {
			System.out.println("Loglandý");
			j+=2;
			
		} while (j<10);
		System.err.println("do while döngüsü bitti.");
		
	}

}
