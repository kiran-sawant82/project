package Assignment.Class_Objects;



public class Product {
	  int id;
	  String name;
	  int price;
	  int qty;
	  
	  public static void main(String[] args) {
		Product p = new Product();
		p.id = 10;
		p.name = "Gulabjamun";
		p.price = 12;
		p.qty = 100;
		
		System.out.println("id = " + p.id + " name =" + p.name + " price = " +  p.price + " quantity = " + p.qty);
	}
	}
