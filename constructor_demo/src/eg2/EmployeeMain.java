package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(100, "Dinesh");
		
		Employee e2=new Employee(101, "Karthik");
		
		System.out.println("Printing e1");
		e1.printEmployee();
		
		System.out.println("\nPrinting e2");
		e2.printEmployee();
		
		Employee e3=new Employee(102, "Radha", 23, "Bengalooruuuu", 1234567890L);
		System.out.println("\nPrinting e3");
		e3.printEmployee();

	}

}