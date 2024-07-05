package Assignment.CoreJava.JavaFundamental.Q1;

public class Product {
 int id;
 String name;
 int Price;
 
 public Product(int i, String n, int p) {
	 id = i;
	 name = n;
	 Price = p;
   
 }
 
 
 public static void main(String[] args) {
	Product p = new Product(1, " Laptop", 10000);
	System.out.println(p.id + p.name + p.Price);
	

}
}
