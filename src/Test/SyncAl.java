package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SyncAl {

	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList();
		l.add(11);l.add(114);l.add(141);l.add("d11");
		
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		List synclist = Collections.synchronizedList(l);
		
		System.out.println("all the resources anr sync up..");
		System.out.println(l);
		System.out.println(synclist);
		
		
	}
	
}
