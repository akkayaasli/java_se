package multiDimensionalArray;


public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cities = new String [3][3];
		
		cities[0][0] = "Istanbul";
		cities[0][1] = "New York";
		cities[0][2] = "Amsterdam";
		cities[1][0] = "New Jersey";
		cities[1][1] = "Brüksel";
		cities[1][2] = "Berlin";
		cities[2][0] = "Londra";
		cities[2][1] = "Bern";
		cities[2][2] = "Prag";
		
		for (int i = 0; i <=2; i++) {
			for (int j = 0; j <=2; j++) {
				System.err.println(cities[i][j]);
			}
			
		}
	}

}
