package Assignment.CoreJava.Methods;

public class Demo10 {

	public static int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(add());
		int addition = Demo10.add();
		System.out.println(addition);
		
	}
}
