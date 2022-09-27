package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Vade Oraný";
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");	
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("img.jpg");
		// set value
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "img.jpg";*/
		// get value
//		System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");	
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("img2.jpg");
		// set value
		/*product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "img2.jpg";*/

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");	
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("img3.jpg");
		// set value
		/*product3.name = "Kitchen Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "img3.jpg";*/
		
		Product[] products = {product1,product2,product3};
		//productlarý tek tek gez:
		System.out.println("<ul>");
		/*
		 * for (Product product : products) { System.out.println("<li>" + product.name +
		 * "</li>"); }
		 */
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05639874569");
		individualCustomer.setCustomerNumber("12589");
		individualCustomer.setFirstName("Aslý");
		individualCustomer.setLastName("Akkaya");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("589632587412");
		corporateCustomer.setCustomerNumber("5986");
		corporateCustomer.setTaxNumber("111111");
		corporateCustomer.setCustomerNumber("2589");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
	}

}
