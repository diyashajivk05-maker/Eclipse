package OOPS;
class Vehicles2{
public Vehicles2(int speed) {
	// TODO Auto-generated constructor stub
	System.out.println("Speed="+speed);
	}
}
class Car2 extends Vehicles2{
	public Car2() {
		// TODO Auto-generated constructor stub
		super(120);
		System.out.println("Speed=150");
	}
}

public class Superkeyword3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 ob=new Car2();

	}

}
