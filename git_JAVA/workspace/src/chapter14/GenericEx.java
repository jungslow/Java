package chapter14;

public class GenericEx {

	public static void main(String[] args) {

		NoGeneric nogen = new NoGeneric();
		String[] ss = {"홍길동", "이순신", "김유신"};
		
		nogen.set(ss);
		nogen.print();
		
		Object[] objs = nogen.get();
		for (Object o : objs) {
			String s = (String)o;
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		nogen.set(ii);
		
		for (Object o:objs) {
			String s = String.valueOf(o);
			System.out.println(s);
		}
	}
}

class NoGeneric {
	Object[] v;
	
	void set(Object[] n) {
		v = n;
	}
	Object[] get() {
		return v;
	}
	void print() {
		for (Object o: v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
	
}
