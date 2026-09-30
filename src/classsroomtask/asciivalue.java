package classsroomtask;

import java.util.Scanner;

public class asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=scan.next().charAt(0);
		int ascii=ch;
		System.out.println("the ascii value of"+ch+"is:"+ascii);

	}

}
