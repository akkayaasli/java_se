package week_two_withAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setname("Laptop");
		product.setid(1);
		product.setdescription("Macbook 13 Pro M2 Processor");
		product.setprice ( 5000);
		product.setstockAmount ( 3);
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getkod());
	}

}
