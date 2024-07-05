package Assignment.CoreJava.JavaFundamental.Q10;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		Employee e = new Employee(101, " Akash ", 1000);
		//display this object data by passing to show method
		Demo d = new Demo();
		d.show(e);
		
		//add 100 bonus in salary 
		e.setSal(100 + e.getSal());
		//display this object data by passing to show method
		d.show(e);
	}
	public void show(Employee e){
		//do required changes in show method
	 System.out.println(e.getId() + e.getName() + e.getSal());
	}
}

