package eg1;

public class Demo {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		int res=0;
		
		try {
		res=x/y;
		String s=null;
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero.. Please re-enter");
		}catch(NullPointerException e) {
			System.out.println("Something is null there");
		}finally {
			System.out.println("Result is "+res);
		}
		System.out.println("This is other LOC in this app");

	}

}