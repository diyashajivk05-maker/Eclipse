package basics;

public class Students {
	//instance var
	String name;//vardeclaration
	//static var
	static String course;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//localvar
		int age;
		
		Students stud1=new Students();
		System.out.println("name="+(stud1.name="anurag"));
		System.out.println("age="+(age=21));
		System.out.println("course="+course);
		
		Students stud2=new Students();
		System.out.println("name="+(stud2.name="madhulika"));
		System.out.println("age="+(age=22));
		System.out.println("course="+(course="developer"));
		
		Students stud3=new Students();
		System.out.println("name="+(stud2.name="lamiya"));
		System.out.println("age="+(age=21));
		System.out.println("course="+(course="developer"));
		
		Students stud4=new Students();
		System.out.println("name="+(stud2.name="shibiludheen"));
		System.out.println("age="+(age=22));
		System.out.println("course="+(course="developer"));





	}

}
