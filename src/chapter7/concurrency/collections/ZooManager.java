package chapter7.concurrency.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ZooManager {

	public static void main(String[] args) {
		AtomicInteger index = new AtomicInteger(1); 
		Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
//		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguin", index.getAndIncrement());
		foodData.put("flamingo", index.getAndIncrement());
		foodData.put("lion", index.getAndIncrement());
		for (String key : foodData.keySet()) {foodData.remove(key);}
		for (int i=0; i<foodData.entrySet().size(); i++){foodData.entrySet().removeIf(k-> k.equals(k));}
		foodData.entrySet().stream().forEach(System.out::println);
	}

}
