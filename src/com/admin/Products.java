package com.admin;

public class Products {

	int ID;
	String description;
	int Price;
	String Category;
	int Quantity;
	
	public Products(int ID, String description, int Price, String Category, int quantity) {
		super();
		this.ID = ID;
		this.description = description;
		this.Price = Price;
		this.Category = Category;
		this.Quantity = quantity;
	}

	public int getPid() {
		return ID;
	}

	public void setPid(int pid) {
		this.ID = pid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String name) {
		this.Category = Category;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}

	@Override
	public String toString() {
		
		return "\n\t"+"\tpid=" + ID + ", \t\tdescription=" + description + ",\t\t price=" + Price + ", \t categories=" + Category
				+ ", \tquantity=" + Quantity ;
	}
	
	
	
	
}