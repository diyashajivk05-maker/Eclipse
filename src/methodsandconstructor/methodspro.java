package methodsandconstructor;

public class methodspro {
	public void sum() {
		int a=23;
		float b=10.90f;
		float sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=100;
		System.out.println("maximum is: "+(Math.max(a,b)));
		
		methodspro ob=new methodspro();
		ob.sum();

	}

}
