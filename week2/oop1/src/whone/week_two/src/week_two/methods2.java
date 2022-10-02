package week_two;

public class methods2 {

	public static void main(String[] args) {
		String message = "This day perfect a day";
		String newMessage = message.substring(0,18);
		System.out.println(newMessage);
		int number=sum(18,6);
		System.out.println(number);
		int sumTM=sum2(2,3,8,9,7);
		System.out.println(sumTM);
	}
	public static void ekle() {
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	public static int sum(int sayi1,int sayi2) {
		return 5;
	}
	public static int sum2(int... numberss) {
		int sumT =0;
		for (int number : numberss) {
			sumT+=number;
		}
		return sumT;
	}
	public static String cityGet() {
		return "New Orlands";
	}

}
