package pack3;

public class TestInnerMain {

	public static void main(String[] args) {
		
		TestVisibilityClass t=new TestVisibilityClass();
		TestVisibilityClass.InnerPublic ip=t.new InnerPublic();
		ip.innerPublicMethod();
		
		
		TestVisibilityClass.InnerStatic.sayHelloPublicStaticInner();
		
		
		TestVisibilityClass.InnerStatic is=new TestVisibilityClass.InnerStatic();
		is.sayHelloPublicStaticInnerClassNonStaticMethod();
	}

}