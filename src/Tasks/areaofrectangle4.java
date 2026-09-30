package Tasks;

import java.util.Scanner;

public class areaofrectangle4 {
	public int area(int l,int b) {
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaofrectangle4 ob=new areaofrectangle4();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length:");
		int l=scan.nextInt();
		System.out.println("enter breadth:");
		int b=scan.nextInt();
		int area=ob.area(l,b);
		System.out.println(area);

	}

}
