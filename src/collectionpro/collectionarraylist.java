package collectionpro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collectionarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<String> li=new LinkedList<String>();
				
				li.add("Arya");
				li.add("21");
				li.add("Aneya");
				li.add("22");
				li.add("Snigdha");
				li.add("20");
				
				System.out.println(li);
				System.out.println("Size="+li.size());
				System.out.println("1st index value="+li.get(1));
				
				//sequential access
				for(int i=0;i<li.size();i++) {
					System.out.println(li.get(i));
				}
				Iterator itr=li.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				li.remove(5);
				System.out.println(li);
				
				List li1=new ArrayList();
				li1.addAll(li);
				System.out.println(li1);
				
				li1.removeAll(li1);
				System.out.println(li1);
				
				li.add("Deva");
				li.add("20");
				
				System.out.println(li);
				li.add("riya");
				System.out.println(li);
				
				System.out.println(li.contains("Snigdha"));
	}

}
