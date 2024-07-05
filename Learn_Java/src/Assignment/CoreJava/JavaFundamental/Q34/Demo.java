package Assignment.CoreJava.JavaFundamental.Q34;

import java.util.Scanner;

import Assignment.CoreJava.JavaFundamental.Common.Employee;

public class Demo {
	public static void main(String[] args) {
		//take data id,name,salary from user using scanner and display that data in show method

		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		e.setId(sc.nextInt());
		System.out.println("Enter name"	);
		e.setName(sc.next());
		System.out.println("Enter Sal");
		e.setSal(sc.nextInt());
		Demo d = new Demo();
		d.show(e);
		
	}

	public void show(Employee e ){
		//display data here by doing required changes
		System.out.println(e.getId() + e.getName() + e.getSal());
	}
}
