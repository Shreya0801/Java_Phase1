package pack1;

public class A_Main {

	public static void main(String[] args) {
		
		A.helloStatic();
		
		A obj=new A();
		obj.helloPublic();
		obj.helloDefault();
		obj.helloProtected();

	}

}