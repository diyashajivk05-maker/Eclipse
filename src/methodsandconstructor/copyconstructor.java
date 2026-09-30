package methodsandconstructor;

public class copyconstructor {
	float l,b;
	float area;
	
	public copyconstructor() {
		l=4.5f;
		b=6.8f;
		area=l*b;
	}
	public void display() {
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconstructor ob=new copyconstructor();
		ob.display();
		copyconstructor ob1=ob;
		ob1.display();
		

	}

}
