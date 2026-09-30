package src;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char exp[]= {'h','e','l','l','o'};
		System.out.println(exp);
		System.out.println(exp[1]);
		
		for(char data :exp) {
			System.out.println(data);
		}
		
		//string array
		String names[]= {"haritha","ashly","anurag","diya"};
		System.out.println(names[2]);
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//string literals
		String name="athul";
		String name1="athul";
		
		System.out.println(name==name1);//true
		
		//new keyword
		String name2=new String("athul");
		String name3=new String("athul");
		
		System.out.println(name2==name3);
		System.out.println(name.equals(name3));
		
		//string methods
		
		System.out.println(name2.equals(name3));
		System.out.println(name.equals(name3));
		
		//String is immutable
		name=name+"   thomas";
		System.out.println(name+"thomas");
		
		String newname=name.concat("santan");//string is immutable
		System.out.println(newname);
		
		//string buffer and builder
		//mutable
		StringBuffer nam=new StringBuffer("Kavya");
		StringBuilder nam1=new StringBuilder("Madhavan");
		nam.append(nam1);
		System.out.println(nam);
		nam.append("Das");
		System.out.println(nam);
	}

}
