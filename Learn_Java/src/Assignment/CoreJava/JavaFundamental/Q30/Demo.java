package Assignment.CoreJava.JavaFundamental.Q30;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static Object m1(){
		//create Employee object here and return
		Employee e = new Employee(101, "Akash", 1000);
		//do required changes in m1 method to do this task
		return e;
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		Employee e = (Employee)Demo.m1();
		//display returned employee data here
	    System.out.println(e.getId() + e.getName() + e.getSal());
	}
}
