package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 28;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i ==0) {
				total = total +i;
				
			}
			
		}
		
		if (total == number) {
			System.out.println("m�kemmel say�");
			
		}
		else {
			System.out.println("m�kemmel say� de�ildir");
		}
	}

}
