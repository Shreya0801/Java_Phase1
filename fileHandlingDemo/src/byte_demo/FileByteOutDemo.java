package byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteOutDemo {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos=new FileOutputStream("bytedemo.txt");
			bos=new BufferedOutputStream(fos);
			String message = "I am new file.";
			byte b[]=message.getBytes();
			bos.write(b);
			System.out.println("Your message is written the file");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				bos.flush();
				fos.close();
				bos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			
		}
	}
}
