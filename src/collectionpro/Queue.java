package collectionpro;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> que= new ArrayDeque<String>();
		
		que.add("Madhulika");
		que.add("98");
		que.add("Diya");
		que.add("88.9");
		que.add("Nandhana");
		que.add("87.9");
		
		System.out.println(que);
		que.addFirst("Anurag");
		que.addLast("Lamiya");
		System.out.println(que);
		
		System.out.println(que.peek());
		que.poll();
		System.out.println(que);
		System.out.println(que.peekFirst());
		System.out.println(que);
		System.out.println(que.peekLast());
		System.out.println(que);



		

	}

}
