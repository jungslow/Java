package chapter18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = 
					new FileOutputStream("src/chapter18/test2.txt", true);
			
			byte[] b = new byte[26];
			byte data = 65;
			for (int i=0; i<b.length; i++) {
				b[i] = data;
				data++;
			}
			fos.write(b); 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("정상 종료되었습니다.");
	}
}
