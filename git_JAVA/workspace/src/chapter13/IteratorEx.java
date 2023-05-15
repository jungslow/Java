package chapter13;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class IteratorEx {

	public static void main(String[] args) {
		
		Iterator it = null;
		
		List list = new ArrayList();
		Set set = new HashSet();
		
		for (int i=0; i<=5; i++) {
			list.add(i);
			set.add(i+5);
		}
		
		System.out.println(list);
		System.out.println(set);

		
		it = list.iterator();
		System.out.println("List Iterator 출력");
		iteratorPrint(it);
		
		it = set.iterator();
		
		System.out.println("Set Iterator 출력");
		iteratorPrint(it);
		
		System.out.println(list);
		System.out.println(set);
	}	
		
	private static void iteratorPrint(Iterator it) {
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
	
}
