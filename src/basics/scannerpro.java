package basics;

import java.util.Scanner;

public class scannerpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//obj creation
		String name;//var declaration
		System.out.println("Enter your name:");
		name=scan.nextLine();
		System.out.println("Name="+name);

	}

}
