 package Assignment.CoreJava.JavaFundamental.Q6;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	
	  public static void main(String[] args) {
		  
		  
	                  //here create object of Employee class and add 101,sam,1000 data into that
		  Employee e = new Employee(101, "sam", 1000);
		  
		        //call show method and pass this created object to show method
		  Demo d = new Demo();
		  
		  d.show(e);
		}
	  
	  
		public void show(Employee e){
			//do required changes to show method and display that data here
			System.out.println(e.getId() + e.getName() + e.getSal());
		}
	}
