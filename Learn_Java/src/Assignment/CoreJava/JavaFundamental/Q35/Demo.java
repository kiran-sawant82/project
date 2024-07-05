package Assignment.CoreJava.JavaFundamental.Q35;

public class Demo {
	static int total = 0;

	public static void add() {  
		int total = 10 + 30;
		Demo.total = total;
	}

	public static void main(String[] args) {
		Demo.add();
		System.out.println(total);
	}
}
