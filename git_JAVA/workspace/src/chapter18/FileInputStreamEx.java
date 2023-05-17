package chapter18;

import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
	
		try {
			FileInputStream fis =
				new FileInputStream("src/chapter18/InputStreamEx.java");
			
			int data = 0;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}

	}

}
