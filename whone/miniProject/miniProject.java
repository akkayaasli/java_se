package miniProject;

public class miniProject {

	public static void main(String[] args) {
		
		int number = 25;
		int remainder = number %2;
		System.out.println(remainder);
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("say? asal de?ildir.");
			return;
		}
		if(number <2) {
			System.out.println("ge?ersiz say?");
		}
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("say? asal");
		}
		else {
			System.out.println("say? asal de?ildir.");
		}

	}

}
