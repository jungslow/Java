package chapter18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("src/chapter18/test3.txt");
						
			fw.write('A');
			
			char[] buf = {'B', 'C', 'D'};
			fw.write(buf);
			fw.write(buf,1,2);
			fw.write(" 저는 홍길동입니다.");
			
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("정상 종료되었습니다.");
	}
}
