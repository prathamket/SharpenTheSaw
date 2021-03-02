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
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("psk", 100);
		hm.put("srk", 200);
		hm.put("ssk", 300);

		System.out.println(hm);

		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> pair = (Entry<String, Integer>) itr.next();
			System.out.println("key: " + pair.getKey() + " Value:" + pair.getValue());
		}
		Map map = sortByValue(hm);
		System.out.println("after sorting ");
		Set s1= map.entrySet();
		Iterator itr1 = s1.iterator();
		while(itr1.hasNext()) {
			Map.Entry pair = (Entry) itr1.next();
			System.out.println("key: " + pair.getKey() + " Value:" + pair.getValue());
		}
	}

	private static HashMap sortByValue(HashMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		HashMap sortedone = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Entry) it.next();
			sortedone.put(entry.getKey(), entry.getValue());
		}
		return sortedone;
	}
	

}



