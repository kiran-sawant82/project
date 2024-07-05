package Assignment.CoreJava.DataTypes_Variables;

public class dt10 {
	static int a = 10;
	public static void main(String[] args) {
      System.out.println("method 1  :"+ a);
      System.out.println("method 2 : "+ dt10.a);
      dt10 dt = new dt10();
      System.out.println("method 3 : " + dt.a);
	}
}
