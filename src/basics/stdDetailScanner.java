package basics;

import java.util.Scanner;

public class stdDetailScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1=new Scanner(System.in);
		String name;
		System.out.println("Enter your name:");
		name=scan1.nextLine();
		System.out.println("Name="+name);
		
		Scanner scan2=new Scanner(System.in);
		String gender;
		System.out.println("Enter gender:");
		gender=scan2.next();
		System.out.println("gender="+gender);
		
		Scanner scan3=new Scanner(System.in);
		int age;
		System.out.println("Enter age:");
		age=scan3.nextInt();
		System.out.println("age="+age);
		
		Scanner scan4=new Scanner(System.in);
		String DOB;
		System.out.println("Enter DOB:");
		DOB=scan4.next();
		System.out.println("DOB="+DOB);
		
		Scanner scan5=new Scanner(System.in);
		String address;
		System.out.println("Enter address:");
		address=scan5.nextLine();
		System.out.println("address="+address);
		
		Scanner scan6=new Scanner(System.in);
		long phno;
		System.out.println("Enter phno:");
		phno=scan6.nextLong();
		System.out.println("phno="+phno);
		
		Scanner scan7=new Scanner(System.in);
		String qualification;
		System.out.println("Enter qualification:");
		qualification=scan7.nextLine();
		System.out.println("qualification="+qualification);
		
		Scanner scan8=new Scanner(System.in);
		int totalmark;
		System.out.println("Enter totalmark:");
		totalmark=scan8.nextInt();
		System.out.println("totalmark="+totalmark);
		
		Scanner scan9=new Scanner(System.in);
		char grade;
		System.out.println("Enter grade:");
		grade=scan9.next().charAt(0);
		System.out.println("grade="+grade);
		
		Scanner scan10=new Scanner(System.in);
		String institutename;
		System.out.println("Enter institute name:");
		institutename=scan10.nextLine();
		System.out.println("institute name="+institutename);
		
		Scanner scan11=new Scanner(System.in);
		String course;
		System.out.println("Enter course:");
		course=scan11.nextLine();
		System.out.println("course="+course);
		
		Scanner scan12=new Scanner(System.in);
		int fees;
		System.out.println("Enter fees:");
		fees=scan12.nextInt();
		System.out.println("fees="+fees);
		
		
		
		
		
		
		


	}

}
