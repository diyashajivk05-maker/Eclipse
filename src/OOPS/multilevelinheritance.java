package OOPS;
class Animal{
	String color;
	public void eat() {
		System.out.println("animal eating");
	}
}
class Dog extends Animal{
	int age;
	public void sound() {
		System.out.println("dog is barking");
	}
}
class Puppy extends Dog{
	String breed;
	public void play() {
		System.out.println("puppy is playing");
	}
}

public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy ob=new Puppy();
		System.out.println("color="+(ob.color));
		System.out.println("age="+(ob.age));
		System.out.println("breed="+(ob.breed));
		ob.sound();
		ob.eat();
		ob.play();
		

	}

}
