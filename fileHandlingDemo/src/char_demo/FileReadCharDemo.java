package char_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCharDemo {

	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("chardemo.text");
				BufferedReader br=new BufferedReader(fr);
				){
			String s=null;
			System.out.println("Message from the file is ");
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}