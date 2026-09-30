package OOPS;
class Vehicles{
	int speed=150;
}
class Car extends Vehicles{
	int speed=160;
	public void display() {
		System.out.println(super.speed);
		System.out.println(speed);
	}
}

public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob=new Car();
		ob.display();

	}

}
