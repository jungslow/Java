package chapter12;

public class ClassEx {

	public static void main(String[] args) {
		
		PropertyEx env = new PropertyEx();
		Class c1 = env.getClass();
		System.out.println(c1.getTypeName());
		
		try {
			Class c2 = Class.forName("chapter12.PropertyEx");
			System.out.println(c2.getTypeName());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
