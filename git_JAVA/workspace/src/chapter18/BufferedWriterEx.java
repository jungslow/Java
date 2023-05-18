package chapter18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("src/chapter18/test4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
						
			bw.write('A');
			
			char[] buf = {'B', 'C', 'D'};
			bw.write(buf);
			bw.write(buf,1,2);
			bw.write(" 저는 홍길동입니다.");
			
			bw.flush();
			bw.close();
			
			//fw.flush();	
			fw.close();					
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("정상 종료되었습니다.");	
		}
		
	}
}
