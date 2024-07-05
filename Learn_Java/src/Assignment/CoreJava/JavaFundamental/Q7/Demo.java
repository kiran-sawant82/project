package Assignment.CoreJava.JavaFundamental.Q7;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void main(String[] args) {
		//here create two objects of Employee class and add  data into that
		
		Employee e = new Employee(10, "Dhani", 1000);
		Employee e1 = new Employee(12, " Rutuja", 2000);
		
		//call show method and pass this two objects to show method
		Demo.show(e, e1);
		
	}
	public static void show(Employee e, Employee e1){
		//do required changes to show method and display that data here
		
		System.out.println(e.getId() + e.getName() + e.getSal());
		System.out.println(e1.getId() + e1.getName() + e1.getSal());
	}
}
