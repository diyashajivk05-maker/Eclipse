package exception;

public class Thrddemo extends Thread{
	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println("New Thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				// TODO Auto-generated method stub
				e.printStackTrace();

			}
		}
	}
}
public class ThreadPro{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thrddemo t=new Thrddemo();
		t.start();
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
