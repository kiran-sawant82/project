package Assignment.CoreJava.JavaFundamental.Q25;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void m1(Object o){
		Employee e = o;
	    System.out.println(e.getId() + e.getName() + e.getSal());

		System.out.println(e.getId() + e.getName() + e.getSal());
	 }
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		Employee e = new Employee(101, "sam", 1000);
		//call m1 method by passing this Employee object
		Demo .m1(e);
	}
}
