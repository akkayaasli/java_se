package week_two_withAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Macbook_13_Pro_M2_Processor",26000,3,"Gümüþ");
		
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getkod());
	}

}
