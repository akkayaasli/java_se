package week_two_withAttributes;

public class Product {
	public Product(int id, String name, String description, int price,int stockAmount, String renk) {
		System.out.println("It has worked constructor block.");
		this._id=id;
		this._renk=renk;
		this._name=name;
		this._price=price;
		this._description=description;
		this._stockAmount =stockAmount;
	}
	public Product() {
		//If you don't want to use constructor block
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	

	public int getid() {
		return _id;
	}
	public void setid(int id) {
		_id = id;
	}
	public String getname() {
		return _name;
	}
	public void setname(String name) {
		_name = name;
	}
	public String getdescription() {
		return _description;
	}
	public void setdescription(String description) {
		_description = description;
	}
	public double getprice() {
		return _price;
	}
	public void setprice(double price) {
		_price = price;
	}
	public int getstockAmount() {
		return _stockAmount;
	}
	public void setstockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}
	public String getrenk() {
		return _renk;
	}
	public void setrenk(String renk) {
		_renk = renk;
	}
	
	public String getkod() {
		return _name.substring(0,1)+_id;
	}
	
}


