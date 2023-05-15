package chapter13;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiees {

	public static void main(String[] args) {
		
		try {
			Properties pr = new Properties();
			
			FileInputStream reader = new FileInputStream(
					"D:/JAVA/Test/src/chapter13"
					+"/config.properties");
	
			pr.load(reader);
			System.out.println(pr);
			System.out.println(" 이름 :" + pr.getProperty("name"));
			
			pr.put("subject", "자바");
			System.out.println(pr);
			
			pr.store(new FileOutputStream(
					"D:/JAVA/Test/src/chapter13"
					+ "/test.properties"), "#save");
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
						
	}
}
