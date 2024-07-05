package Assignment.CoreJava.JavaFundamental.Q28;

public class Demo {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int total = 100 + Demo.m1(100);
		System.out.println(total);
	}
}
