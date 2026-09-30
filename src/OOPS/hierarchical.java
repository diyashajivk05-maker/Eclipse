package OOPS;
class Animal {
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
class Cat extends Animal{
	String name="kitty";
	public void play() {
		System.out.println("cat meows");
	}
}
public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob=new Dog();
		System.out.println("color:"+(ob.color="grey"));
		System.out.println("age:"+(ob.age=2));
		ob.sound();
		ob.eat();
		
		Cat ob1=new Cat();
		System.out.println("color:"+(ob.color));
		System.out.println(ob1.color);
		ob1.eat();
		ob1.play();
	}

}
