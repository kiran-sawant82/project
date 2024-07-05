package Assignment.CoreJava.DataTypes_Variables;


public class dt14 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 1;
		emp.name = "sam";
		emp.sal = 1000;
		
		Employee emp2 = new Employee();
		emp2.id = emp.id;
		emp2.name = emp.name;
		emp2.sal = emp.sal;
		dt14.display(emp2);
		
		
	}
	public static void display(Employee emp) {
		System.out.println(emp.id + " " + emp.name + " "+ emp.sal);
	}
}


