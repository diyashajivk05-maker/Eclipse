package methodsandconstructor;

import java.util.Scanner;

public class category2 {
	//no return type with parameter
	public void add(int num1,int num2) {
		System.out.println("sum="+(num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=scan.nextInt();
		System.out.println("enter second number ");
		int b=scan.nextInt();
		category2 ob=new category2();
		ob.add(a,b);

	}

}
