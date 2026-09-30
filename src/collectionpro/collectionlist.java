package collectionpro;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.List;

public class collectionlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList li=new ArrayList();
		List li=new ArrayList();
		
		li.add("Madhulika");
		li.add(98);
		li.add("Diya");
		li.add(88.9);
		li.add("Nandhana");
		li.add(87.9);
		
		System.out.println(li);
		System.out.println("Size="+li.size());
		System.out.println("3rd index value="+li.get(3));
		
		//sequential access
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		li.remove(4);
		System.out.println(li);
		
		List li1=new ArrayList();
		li1.addAll(li);
		System.out.println(li1);
		
		li1.removeAll(li1);
		System.out.println(li1);
		
		li.add("Lamiya");
		li.add(88.9);
		
		System.out.println(li);
		li.add(null);
		System.out.println(li);
		
		System.out.println(li.contains("Nandhana"));


		

	}

}
