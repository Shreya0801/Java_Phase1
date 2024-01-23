package serialize;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.CreditCard;

public class Serialization {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("ccdata.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos); ){
			CreditCard cc=new CreditCard(1234567890123456L, "Vinay N Ingalahalli", "Simplilearn Bank", "RuPAY", 122);
			oos.writeObject(cc);
			System.out.println(cc);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
