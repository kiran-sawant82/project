package Assignment.CoreJava.JavaFundamental.Q24;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void m1(Employee e){

		System.out.println(e.getId() + e.getName() + e.getSal());
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee e = new Employee(101, " Samir ", 1000);
		Demo.m1(e);
		
	}
}
