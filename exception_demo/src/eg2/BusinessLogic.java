package eg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BusinessLogic {

	
	public void openFile(String fileName) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
	}
	
	public int divide(int x,int y) throws ArithmeticException,NullPointerException{
		return x/y;
	}
	
	
	public int customDivide(int x,int y)throws ArithmeticException {
		
		if(x<=0 || y<0) {
			throw new ArithmeticException("the values cannot be zero or -ve");
		}
		if(y==0) {
			throw new ArithmeticException("we cannot divide by zero...");
		}
		return x/y;
	}
	
	
}