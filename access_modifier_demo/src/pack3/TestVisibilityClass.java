package pack3;

public  class TestVisibilityClass {

	private class InnerPrivate{
		
	}
	protected class InnerProtected{
		
	}
	public static class InnerStatic{
	
		public static void sayHelloPublicStaticInner() {
			System.out.println("Hello from static inner public class static method");
		}
		public  void sayHelloPublicStaticInnerClassNonStaticMethod() {
			System.out.println("Hello from static inner public class non-static method");
		}
	}
	
	public class InnerPublic{
		public void innerPublicMethod() {
			System.out.println("Inner public class method..........");
		}
	}
	
	
}

class A{
	
}

//public class M{}

class B{
	
}

class C{
	
}