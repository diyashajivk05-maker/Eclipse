package classsroomtask;

import java.util.Scanner;

public class thirdvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("enter a:");
		a=scan.nextInt();
		int b;
		System.out.println("enter b:");
		b=scan.nextInt();
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//without using 3rd variable
		Scanner scan1=new Scanner(System.in);
		int a1;
		System.out.println("enter a1:");
		a1=scan1.nextInt();
		int b1;
		System.out.println("enter b1:");
		b1=scan1.nextInt();
		a1=a1+b1;//30
		b1=a1-b1;//10
		a1=a1-b1;
		System.out.println("a1="+a1);
		System.out.println("b1="+b1);

	}

}
	

