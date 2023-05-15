package chapter13;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		for (int i=0; i<=5; i++) {
			list.add(i);
		}
		
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}
}
