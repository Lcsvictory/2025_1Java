package week14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("java");
		arr1.add("java12");
		arr1.add("ss");
		System.out.println(arr1.size());
		String item = arr1.get(2);
		System.out.println(item);
		System.out.println(arr1.size());
		for (var s : arr1) {
			System.out.printf("%s ", s);
		}
		System.out.println();
		arr1.remove(1);
		for (int i = 0; i < arr1.size(); ++i) {
			System.out.println(i + " : " + arr1.get(i));
		}
		
		Vector<String> vec = new Vector<String>();
		vec.add("대한");
		vec.add("민국");
		vec.add("만세");
		
		System.out.println();
		for(var s : vec) {
			System.out.printf("%s ", s);
		}
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("apple");
		ll.add("banana");
		ll.add("coke");
		
		ll.remove("banana");
		System.out.println(ll.get(1));
		
		Set<String> set1 = new HashSet<String>();
		set1.add("qwe");
		set1.add("qwe");
		set1.add("asd");
		set1.add("zxc");
		System.out.println(set1.size());
		Iterator<String> iter = set1.iterator();
		for (var s : set1) {
			System.out.printf("%s ", s);
		}
		System.out.println();
		while (iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(4, "네번째");
		
		System.out.println(map.keySet());
		for (var k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		Iterator<String> iter1 = map.values().iterator();
		while (iter1.hasNext()){
			System.out.printf("%s ", iter1.next()); 
		}
		
		for (var v : map.values()) {
			System.out.println(v);
		}
	}
}
