package Assignment.CoreJava.JavaFundamental.Q21;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee e = new Employee();
		Demo.m1(e);
	}
}
