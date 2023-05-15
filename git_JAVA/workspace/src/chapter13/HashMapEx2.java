package chapter13;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		String[] names = {"홍길동", "김유신", "이순신", "강감찬","김유신"};
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		
		for (int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		Set <String> keys = map.keySet();		//  모든 key를 Set객체로 리턴
		for (String key : keys) {
			System.out.println(key+ "=" + map.get(key));
		}
		
		System.out.println("Iterator로 출력");
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String a = (String)it.next();
			System.out.println(a+ "="+ map.get(a));	
		}
		
	}

}
