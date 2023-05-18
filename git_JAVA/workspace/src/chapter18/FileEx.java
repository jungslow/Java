package chapter18;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		
		File file = new File("src/chapter18/test4.txt");
		// 파일인가? 여부
		System.out.println(file.isFile());
		// 디렉토리인가? 여부	
		System.out.println(file.isDirectory());
		// 파일명	
		System.out.println(file.getName());
		// 파일 절대경로명	
		System.out.println(file.getAbsolutePath());
		// 생성자에 넣어준 경로
		System.out.println(file.getPath());
		// 읽기 권한이 있는지 여부
		System.out.println(file.canRead());
		// 쓰기 권한이 있는지 여부
		System.out.println(file.canWrite());
		// 파일 크기(용량, byte) 
		System.out.println(file.length());
		
	}
}
