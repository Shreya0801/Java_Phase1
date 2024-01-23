package custom_exception_demo;

public class Main {

	public static void main(String[] args) {
		Validation v=new Validation();
		try {
			if(v.isValidAge(34)) {
				System.out.println("Age validated");
			}
		} catch (BusinessCheckedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		if(v.isValidIndianMobileNumber("+91-123456789")) {
			System.out.println("Mobile number validated");
		}
		}catch(BusinessUncheckedException e) {
			System.out.println(e.getMessage());
		}

	}

}