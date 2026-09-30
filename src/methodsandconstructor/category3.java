package methodsandconstructor;

import java.util.Scanner;

public class category3 {
	public int add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=scan.nextInt();
		System.out.println("enter second number ");
		int num2=scan.nextInt();
		return num1+num2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		category3 ob=new category3();
		System.out.println(ob.add());
		

	}

}
