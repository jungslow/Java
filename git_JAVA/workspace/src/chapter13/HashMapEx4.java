package chapter13;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapEx4 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		String[] names = {"홍길동", "김유신", "이순신", "강감찬","김유신"};
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		
		for (int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		Set entry = map.entrySet();
		for (Object o : entry) {
			Map.Entry m = (Map.Entry)o;
			System.out.println("key:" + m.getKey() + ", value:"+m.getValue());
		}
				
	}
}
