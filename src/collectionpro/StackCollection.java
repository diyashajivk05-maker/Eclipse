package collectionpro;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ob=new Stack();
		ob.push(11);
		ob.push(20);
		ob.push(1);
		ob.push(2);
		
		System.out.println(ob);
		ob.push(20);
		System.out.println("Elements:"+ob);
		
		//top element
		System.out.println("Top element:"+ob.peek());
		ob.peek();
		
		//remove top elements
		System.out.println(ob);
		System.out.println("Top element:"+ob.peek());
		ob.pop();

	}

}
