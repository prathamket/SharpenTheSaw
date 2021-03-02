package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HMDSeri {
	public static void main(String[] args) throws IOException {

		HashMap hm = null;
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\pketgale\\Desktop\\hm.ser");
			ObjectInputStream oos = new ObjectInputStream(fis);
			hm = (HashMap) oos.readObject();
			oos.close();
			fis.close();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deseri hm");
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry pair = (Entry) itr.next();
			System.out.println(pair.getKey()+"  "+pair.getValue());
			
		}
	}
}
