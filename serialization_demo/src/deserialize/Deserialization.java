package deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.CreditCard;

public class Deserialization {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("ccdata.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			CreditCard cc = (CreditCard)ois.readObject();
			System.out.println("CreditCard Object deserialized successfully with below data");
			System.out.println(cc);
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 
	}

}
