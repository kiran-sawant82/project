package Assignment.CoreJava.JavaFundamental.Q33;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void show(Employee e){
		System.out.println(e.getId() + e.getName() + e.getSal());
	}
	public static void process(int i, String n, int s){
		Employee e = new Employee(i, n, s);
		Demo.show(e);
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		Employee e = new Employee();
		//add data into that empty object using process method
		Demo.process(101,"sam", 1000);
		//display employee object with data in show method
	}
}
