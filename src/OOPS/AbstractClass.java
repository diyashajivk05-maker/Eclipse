package OOPS;
abstract class Vehicles{
	public abstract void starts();//abstract method
	public void sound() {        //non abstract method/concrete method
		System.out.println("beep....beep...");
	}
}
class Bike extends Vehicles{
	
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("kick start");

	}
}
class Train extends Bike{
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("button start");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.starts();
		b.sound();
		
		Vehicles ob=new Train();//upcasting
		ob.starts();
		

	}

}
