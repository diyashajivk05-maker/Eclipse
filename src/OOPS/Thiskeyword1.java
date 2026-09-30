package OOPS;

public class Thiskeyword1 {
	String name;
	int age;
	
	public Thiskeyword1(String name,int age) {
		// TODO Auto-generated method stub
		name=name;
		age=age;
	}
	
	public void display() {
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword1 ob=new Thiskeyword1("manu",21);
		ob.display();
	}

}
