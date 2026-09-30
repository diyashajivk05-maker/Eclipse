package arrayandstrings;

import java.util.Scanner;

public class twodimensionalscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter row size");
		int r=scan.nextInt();
		
		System.out.println("enter column size");
		int c=scan.nextInt();
		
		System.out.println("enter elements");
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			}
		}
		System.out.println("elements are:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
