package exception;

public class threadpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current thread="+t);
		
		String threadname=Thread.currentThread().getName();
		System.out.println("Threadname="+threadname);
		
		//change the name of the thread
		t.setName("New thread");
		System.out.println("Thread="+t);
		String newname=Thread.currentThread().getName();
		System.out.println(newname);
		
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);				//sleep is used
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
