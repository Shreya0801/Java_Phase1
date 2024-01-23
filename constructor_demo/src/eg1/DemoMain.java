package eg1;

public class DemoMain {

	public static void main(String[] args) {
		
		//Classname objname = new Constructor();
		
		Calculator c=new Calculator("Shreya");
		
		Calculator c1=new Calculator();
		
		
		Calculator c2=new Calculator(100, 200);
		System.out.println("Result is with c2 object : "+c2.add());
		
		System.out.println("Result is with c1 object : "+c1.add());
	}

}