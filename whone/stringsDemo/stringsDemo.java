package stringsDemo;

public class stringsDemo {

	public static void main(String[] args) {
		String message = "ýt's weather is today very good";
		System.out.println(message);
		
		System.out.println("Element numbers : " + message.length());
		System.out.println("5. element : "+ message.charAt(4));
		System.out.println(message.concat(" Hurray !"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0,5,characters,0);
		System.out.println(characters);
		System.out.println(message.indexOf("av"));
		System.out.println(message.lastIndexOf("e"));
		
		
		System.out.println("****************************************************");
		
		String newMessage = message.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for (String kelime :message.split("")) {
			System.out.println(kelime);
		}
		System.out.println(message.toLowerCase());
		
		
		
		
		
		
		
		

	}

}
