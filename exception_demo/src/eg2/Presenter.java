package eg2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		
		BusinessLogic bl=new BusinessLogic();
		try {
			bl.openFile("open.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
		System.out.println("result is "+bl.divide(10, 0));
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("result for custom divide is "+bl.customDivide(-10, 10));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}