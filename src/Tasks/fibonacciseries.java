package Tasks;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int num=scan.nextInt();
		int a=1,b=2,c;
		System.out.println(a+" "+b+" ");
		for(int i=3;i<num;i++) {
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}

	}

}
