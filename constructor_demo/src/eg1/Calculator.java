package eg1;

public class Calculator {

	private int x;
	private int y;
	
	/*
	 * Calculator(){}
	 */
	
	public Calculator(String name) {
		System.out.println("Hello "+name);
	}
	
	public Calculator() {
		System.out.println("I am  zero arg constructor");
	}
	
//	public Calculator(int a,int b) {
//		x=a;
//		y=b;
//	}
	public Calculator(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public int add() {
		return x+y;
	}
}