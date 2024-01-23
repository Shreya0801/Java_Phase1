package eg;

public class Calculator {
	
	public void add(int a,int b) {
		System.out.println("void(int,int) was called and result is "+(a+b));
	}
	
	public int add(int a,int b,int c) {
		System.out.println("int(int,int,int) was called ");
		return a+b+c;
	}
	
	public void add(float a,float b) {
		System.out.println("void(float,float) was called and result is "+(a+b));
	}
	
	public String add(String s1,String s2) {
		return s1+" "+s2;
	}

}