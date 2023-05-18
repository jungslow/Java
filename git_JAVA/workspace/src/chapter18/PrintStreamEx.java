package chapter18;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class PrintStreamEx {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("src/chapter18/print.txt", true);
			PrintStream ps = new PrintStream(fos);
			
			ps.println("홍길동");
			ps.println(1111);
			ps.println(true);
			ps.println(3.14);
			
			ps.flush();
			ps.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("정상 종료되었습니다.");
	}
}
