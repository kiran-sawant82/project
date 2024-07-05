package Assignment.CoreJava.JavaFundamental.Q11;

public class Demo {
	public static void main(String[] args) {
		//call show method in different ways
		show();
		Demo.show();
	    Demo d = new Demo();
	    d.show();
	}
	
	
	public static void show(){
		System.out.println("show method");
	}
}
  