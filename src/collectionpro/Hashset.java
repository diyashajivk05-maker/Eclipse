package collectionpro;

import java.util.ArrayDeque;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ob= new HashSet<String>();
		
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
