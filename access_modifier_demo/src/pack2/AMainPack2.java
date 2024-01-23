package pack2;

import pack1.A;

public class AMainPack2 {

	public static void main(String[] args) {
		
		A.helloStatic();
		
		A a=new A();
		a.helloPublic();
		a.helloStatic();
		a.accessPrivate();

	}

}