package chapter18;

import java.io.IOException;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		try {
		
			fr = new FileReader("src/chapter18/InputStreamEx.java");
			
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
//				System.out.print(data);
			}
		} catch (IOException e) {
			System.out.print(e);
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				System.out.print(e);
			}
		}

	}
}
