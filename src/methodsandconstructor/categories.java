package methodsandconstructor;

import java.util.Scanner;

public class categories {
	//function with no return type
	public void categories() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=scan.nextInt();
		System.out.println("enter second number ");
		int num2=scan.nextInt();
		System.out.println("sum="+(num1+num2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		categories ob=new categories();
		ob.categories();
	}

}
