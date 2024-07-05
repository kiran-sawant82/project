package Assignment.CoreJava.JavaFundamental.Q32;

public class Demo {
	public static int m1(int i){
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
		int a = Demo.m1(10);
		System.out.println(a);
	    System.out.println(Demo.m1(a));
	    
	    Demo d = new Demo();
	    int b = d.m1(a);
	    System.out.println(b);
	}
}
