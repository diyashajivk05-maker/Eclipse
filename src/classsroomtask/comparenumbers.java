package classsroomtask;

import java.util.Scanner;

public class comparenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("first num:");
		System.out.println("second num:");
		int f_n=scan.nextInt();
		int s_n=scan.nextInt();
		
		System.out.println(f_n!=s_n);
		System.out.println(f_n<s_n);
		System.out.println(f_n<=s_n);
	}

}
