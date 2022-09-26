package switchDemo1;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("WONDERFUL");			
			break;
	
		case 'B':
			System.out.println("VERY GOOD");			
			break;

			
		case 'C':
			System.out.println("GOOD");			
			break;

			
		case 'D':
			System.out.println("SO SO");			
			break;
		case 'F':
			System.out.println("I AM SORRY. YOU DONT PASSED.");			
			break;


		default:
			System.out.println("INVALID NUMBER DUDE");	
			break;
		}

	}

}
