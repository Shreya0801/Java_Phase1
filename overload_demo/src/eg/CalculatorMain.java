package eg;

public class CalculatorMain {

	public static void main(String[] args) {
	
		Calculator c=new Calculator();
		int x=100;
		int y=99;
		int z=22;
		
		float f1=22.25f;
		float f2=99.99f;
		
		
		c.add(x, y);//call by value
		
		int res=c.add(x, y, z);
		System.out.println("res = "+res);
		
		c.add(f1, f2);
		
		String answer=c.add("Shreya", "Singh");//call by reference
		System.out.println(answer);

	}

}