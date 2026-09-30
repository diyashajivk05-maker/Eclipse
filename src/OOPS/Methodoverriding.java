package OOPS;
class Birds{
	public void sound() {
		System.out.println("tweet...tweet...");
	}
}
class Duck extends Birdss{
	public void sound() {
		System.out.println("quack...quack...");
	}
}


public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck d=new Duck();
		d.sound();
		
		Birdss b=new Duck();//dynamic binding
		b.sound();

	}

}
