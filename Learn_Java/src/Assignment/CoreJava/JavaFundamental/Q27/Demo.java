package Assignment.CoreJava.JavaFundamental.Q27;

public class Demo {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int mul = Demo.m1(10);
	}
}
