package pack1;

public class A {
	
	public void helloPublic() {
		System.out.println("Hello Public from Class A");
	}
	
	private void helloPrivate() {
		System.out.println("Hello from private method in Class A");
	}
	
	protected void helloProtected() {
		System.out.println("Hello from protected method in Class A");
	}
	
	void helloDefault() {
		System.out.println("Hello from default method in Class A");
	}
	
	public static void helloStatic() {
		System.out.println("Hello static public from Class A");
	}
	
	public void accessPrivate() {
		helloPrivate();
	}

}