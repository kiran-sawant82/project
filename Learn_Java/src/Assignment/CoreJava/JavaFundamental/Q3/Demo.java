package Assignment.CoreJava.JavaFundamental.Q3;

import Assignment.CoreJava.JavaFundamental.Common.*;

public class Demo {

	public static void main(String[] args) {

		// here create object of Employee class and add 101,sam,1000 data into that
		// using setter method
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("sam");
		e.setSal(1000);
		
		

		// display that data here
		
		System.out.println(e.getId() + e.getName() + e.getSal());
	}
}
