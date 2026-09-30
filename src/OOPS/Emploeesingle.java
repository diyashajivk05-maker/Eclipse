package OOPS;

class Employee{
String worktype;
public void salary() {
	System.out.println(30000);
	}
}

class Developer extends Employee{
	String Design;
	public void time() {
		System.out.println("3pm");
	}
}
public class Emploeesingle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer ob=new Developer();
		System.out.println("worktype="+(ob.worktype="parttime"));
		System.out.println("Designation="+(ob.Design="bca"));
		ob.salary();
		ob.time();
	}

}
