package Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;

import java.util.Set;
import java.util.TreeMap;

public class Lab1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");
		System.out.println("before sorting..");
		System.out.println(hashmap);

		Set set1 = hashmap.entrySet();
		Iterator itr = set1.iterator();
		while (itr.hasNext()) {
			// Map<Integer, String> map =
			Map.Entry<Integer, String> pair = (Entry<Integer, String>) itr.next();
			System.out.println("key: " + pair.getKey() + " values: " + pair.getValue());
		}
		System.out.println("=========");

		/*
		 * Map<Integer, String> map = new TreeMap<Integer, String>(hashmap); for
		 * (Integer obj : map.keySet()) {
		 * System.out.println("key: "+obj+" values: "+map.get(obj)); }
		 */

		Map<Integer, String> map = sortedByValue(hashmap);
		Set set2 = map.entrySet();
		Iterator itr1 = set2.iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> pair = (Entry<Integer, String>) itr.next();
			System.out.println("key: " + pair.getKey() + " values: " + pair.getValue());
		}
	}

	private static HashMap<Integer, String> sortedByValue(HashMap hm) {

		List list = new LinkedList(hm.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return -1;
			}

		});
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}
