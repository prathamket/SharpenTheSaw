package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList();
	
	//int n=10, n1=0,n2=1; 
	for(int i=1;i<=10;i++) {
		/*
		 * System.out.print(" "+n1); int sum = n1+n2; n1 = n2; n2 = sum;
		 */
	al.add(i);	
	}
	//System.out.println(al);
	for (Integer obj : al) {
		//System.out.println(obj);
	}
	
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	hm.put(11, 100);
	hm.put(12, 200);
	hm.put(13, 300);
	System.out.println(hm);
	Set s = hm.keySet();
	System.out.println(s);
	System.out.println(hm.values());
	
	for (Integer key : hm.keySet()) {
		System.out.println("kes " +key +" Value: "+hm.get(key));
	}
}
}
