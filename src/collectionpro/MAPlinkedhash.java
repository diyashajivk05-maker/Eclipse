package collectionpro;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MAPlinkedhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> ob= new LinkedHashMap<Integer,String>();
		
		ob.put(100, "lamiya");
		ob.put(101, "madhulika");
		ob.put(102, "nandhana");
		ob.put(103, "diya");
		ob.put(104, "anurag");

		System.out.println(ob);
		
		Set mapset=ob.entrySet();
		Iterator itr=mapset.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(entry.getKey()+"=="+entry.getValue());
			
	}

}
}
