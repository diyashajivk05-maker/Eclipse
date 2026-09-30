package exception;

public class Exceptionpro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try {
			System.out.println(a/10);
			int arr[]=null;
			System.out.println(arr[0]);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			// TODO Auto-generated method stub
			System.out.println(e2);

		}
		catch(Exception e) {       			//should not give exception e in first
			System.out.println(e);
		}                              
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		}
	}

