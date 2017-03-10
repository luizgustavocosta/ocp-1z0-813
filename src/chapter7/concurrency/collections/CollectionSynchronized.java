package chapter7.concurrency.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Just for obtain a synchronized Collection
public class CollectionSynchronized {

	public static void main(String[] args) {
		// If you know at the time of creation that your object 
		// requires synchronization, then you should use one of the 
		// concurrent collection syncronized*
		// Collection/List/Map/NavigableMap/NavigableSet/Set/SortedMap/SortedSet
		
		List<Integer> list = Collections.synchronizedList(Arrays.asList(4,3,52));
		synchronized(list){
			for (int item:list){
				System.out.print(item+" ");
				//list.add(2);
				// Unlike the concurrent collections, the synchronized collections
				// also throw an exception if they are modified within an iterator
				// by a single thread.
			}
		}
		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguim", 1);
		foodData.put("flamingo", 2);
		Map<String, Object> synchronizedMap = Collections.synchronizedMap(foodData);
		for (String key:synchronizedMap.keySet()){
			synchronizedMap.remove(key);
		}
		// To avoid ConcurrentModificationException use 
		//Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
	}

}
