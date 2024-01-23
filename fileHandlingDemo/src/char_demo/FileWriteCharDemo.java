package char_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("chardemo.text");
				BufferedWriter bw = new BufferedWriter(fw);){
			bw.write("I am first line of the file.");
			bw.newLine();
			bw.write("I am second line of the file.");
			bw.newLine();
			bw.write("I am the third line.");
			System.out.println("Message written to file successfully.");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
