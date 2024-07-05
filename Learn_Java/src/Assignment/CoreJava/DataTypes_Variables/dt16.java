package Assignment.CoreJava.DataTypes_Variables;

public class dt16 {
 static int id1;
 static String name1;
 static int sal1;
 
 public static void main(String[] args) {
	Employee e = new Employee();
	e.id = 1;
	e.name ="sam";
	e.sal = 1000;
	 
	dt16.id1 = e.id;
	dt16.name1 = e.name;
	dt16.sal1  = e.sal;
	
}
}
