package methodsandconstructor;

import java.util.Scanner;

public class category4 {
	//with return type and with parameter
	public int add(int num1,int num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		category4 ob=new category4();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=scan.nextInt();
		System.out.println("enter second number ");
		int b=scan.nextInt();
		int sum=ob.add(a,b);
		System.out.println(sum);
	}

}
