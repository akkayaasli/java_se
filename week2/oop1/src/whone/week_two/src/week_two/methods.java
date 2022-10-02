package week_two;

public class methods {

	public static void main(String[] args) {
		accountFind();

	}
	public static void accountFind() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi:sayilar) {
			if(sayi == aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			message("MessageTest");
			
		}
		else
		{
			System.out.println("sayý mevcut deðildir.");
		}
	}
	public static void message(String msg) {
		System.out.println(msg);
	}

}
