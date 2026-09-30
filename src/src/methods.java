package src;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string length
		String a="Diya";
		System.out.println(a.length());
		
		//charAt
		char b=a.charAt(2);
		System.out.println(b);
		
		//compare to
		String s1="Diya";
		String s2="DIYA";
		String s3="diya";
		String s4="comeon";
		System.out.println(s1.compareTo(s2) );
		System.out.println(s1.compareTo(s3) );
		System.out.println(s1.compareTo(s4) );
		
		System.out.println(s1.concat(s2));
		
		//contains
		String s="java is a high level programming language";
		System.out.println(s.contains("high level"));
		System.out.println(s.contains("low level"));
		
		//equal
		String c="course";
		String d=new String("softwaretesting");
		System.out.println(c.equals(d));
		
		//equalignrecase
		String e="kerala";
		String f="tamilnadu";
		System.out.println(e.equalsIgnoreCase(f));
		
		//tolowercase
		String g="DEVA";
		String h="narayan";
		System.out.println(g.toLowerCase());
		System.out.println(h.toUpperCase());






		




		
		

	}

}
