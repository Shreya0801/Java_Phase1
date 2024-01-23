package custom_exception_demo;

public class Validation {

	public boolean isValidAge(int age) throws BusinessCheckedException {
		if(age<=0) {
			throw new BusinessCheckedException("age cannot be -ve or zero");
		}
		if(age <18 || age > 33) {
			throw new BusinessCheckedException("only users with age 18 to 33 with valid ID proof are allowed");
		}
		
		return true;
	}
	
	public boolean isValidIndianMobileNumber(String mobileNumber)throws BusinessUncheckedException {
		boolean b=false;
		if(mobileNumber.matches("\\+91-[0-9]{10}")) {
			b=true;
		}else {
			throw new BusinessUncheckedException("Entered mobile number "+mobileNumber+" is not a valid INDIA number");
		}
		
		return b;
		
	}
}