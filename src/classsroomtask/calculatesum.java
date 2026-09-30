package classsroomtask;

import java.util.Scanner;

public class calculatesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter firstnum:");
		int a=scan.nextInt();
		System.out.println("enter secondnum:");
		int b=scan.nextInt();
		System.out.println("enter thirdnum:");
		int c=scan.nextInt();
		System.out.println((a+b)==c||(b+c)==a||(c+a)==b);
		

	}

}
