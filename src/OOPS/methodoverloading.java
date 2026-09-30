package OOPS;

public class methodoverloading {
	public void add() {
		int num1=20,num2=30,sum;
		sum=num1+num2;
		System.out.println(sum);
	}
	public void add(int num1,int num2) {
		System.out.println("sum="+(num1+num2));
	}
	public void add(int num1,float num2) {
		System.out.println("sum="+(num1+num2));
	}
	public void add(float num1,int num2) {
		System.out.println("sum="+(num1+num2));
	}
	public void add(int num1,int num2,int num3) {
		System.out.println("sum="+(num1+num2+num3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading ob=new methodoverloading();
		ob.add();
		ob.add(40, 10, 40);
		
		

	}

}
