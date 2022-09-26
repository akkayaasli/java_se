package recapDemo2;

public class recapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1.2,6.3,4.3,5.6};
		double total = 0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.err.println(number);
		}
		System.err.println("Toplam = " + total);
		System.err.println("En Büyük = " + max);
	}

}
