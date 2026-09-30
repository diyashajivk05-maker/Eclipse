package OOPS;
class Vehicles1{
public void speed() {
	System.out.println(120);
	}
}
class Car1 extends Vehicles1{
	public void speed() {
		super.speed();
		System.out.println(140);
	}
}
public class Superkeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 ob=new Car1();
		ob.speed();
	}

}
