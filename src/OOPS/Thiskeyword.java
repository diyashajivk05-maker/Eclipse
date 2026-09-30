package OOPS;

public class Thiskeyword {
	String name;
	int age;
	
	public Thiskeyword(String name,int age) {
		// TODO Auto-generated method stub
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword ob=new Thiskeyword("manu",21);
		ob.display();
		


		}


		
	}


