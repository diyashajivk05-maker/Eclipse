package collectionpro;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ob= new LinkedHashSet<String>();
		
		ob.add("Madhulika");
		ob.add("Ashly");
		ob.add("Diya");
		ob.add("Karan");
		ob.add("Nandhana");
		ob.add("Jiya");
		
		System.out.println(ob);
		
		for(String data:ob) {
			System.out.println(data);
		}
		
		ob.add("Diya");
		System.out.println(ob);
		
		ob.add(null);
		System.out.println(ob);
		

	}

}
