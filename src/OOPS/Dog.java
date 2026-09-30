package OOPS;
class Animal {
	//single inheritance
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob=new Dog();
		System.out.println("color:"+(ob.color="grey"));
		System.out.println("age:"+(ob.age=2));
		ob.sound();
		ob.eat();


	}

}
