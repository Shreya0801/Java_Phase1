package myPack;

public class MyJavaClass {

	public static void main(String[] args) {
		System.out.println("Hellooooo");
		
		//Single Line comment
		/*
		 * Hi I am multiline comment
		 * 
		 */
		
		/*
		 * Data Types
		 * type  size  defaultvalue
		 * ---------------------------
		 * byte 1byte    0
		 * short 2byte   0
		 * int   4bytes  0
		 * long  8       0
		 * 
		 * float 4bytes  0.0000f
		 * double 8bytes  0.0000d (default)
		 * 
		 * char  2bytes  '\u0000'(uni-code charset)
		 * boolean 1bit   false
		 * 
		 */
		int x=100;
		System.out.println("x = "+x);
		float f1=99.9f;
		System.out.println("f = "+f1);
		double d1=88.88d;
		System.out.println("d1 = "+d1);
		
		/*
		 * Type Casting
		 * 1)Implicit Casting(Compiler)(smaller type to larger)
		 * 2)Explicit Casting(Programmer)(larger one to smaller)
		 */
		
		float m=x; //implicit
		System.out.println("m = "+m);
		
		
		double r=89.77;
		int h=(int)r;//explicit
		System.out.println("h = "+h);
		
		
		char c='A';
		int s=c;
		
		System.out.println("s = "+s);
		
		s=97;
		c=(char)s;
		System.out.println("c = "+c);
		
		
	}
}
