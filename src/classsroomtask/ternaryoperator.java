package classsroomtask;

import java.util.Scanner;

public class ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num:");
		int num=scan.nextInt();
		String result=(num%2==0)?"even":"odd";
		System.out.println(result);
	}
}
