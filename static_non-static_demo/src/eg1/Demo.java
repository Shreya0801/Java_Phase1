package eg1;

public class Demo {
	
	int x; //global & instance level
	int y; //global & instance level
	static int z; //global & class level

	public static void main(String[] args) {
		heyy();
		Demo d1=new Demo();
		d1.x=200;
		d1.y=700;
		d1.z=500;
		System.out.println("printing values of d1");
		d1.printValues();
		
		Demo d2=new Demo();
		d2.x=9000;
		System.out.println("printing values of d2");
		d2.printValues();
		
		z=1000000;
		System.out.println("printing values of d1 again");
		d1.printValues();
		
		System.out.println("printing values of d2 again");
		d2.printValues();

	}
	
	public static void heyy() {
		System.out.println("Hello static from the class Demo");
	}
	
	public void printValues() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
	}

}