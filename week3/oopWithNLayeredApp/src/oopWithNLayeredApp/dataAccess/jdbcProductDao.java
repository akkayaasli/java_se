package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao {
	public void add(Product product) {
		System.out.println("JDBC ile veritabanýna eklendi.");
	}
}
