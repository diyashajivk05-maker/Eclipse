package src;

public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.PG");
		System.out.println("a.MCA \t b.MBA \t c.MTech");
		System.out.println("2.UG");
		System.out.println("a.BBA \t b.BSC \t c.BTech");
	
		int qualification=1;
		char course='b';
		
		switch(qualification) {
		case 1:System.out.println("1.PG");
		switch(course) {
		
		case 'a' :System.out.println("a.MCA");
		break;
		
		case 'b' :System.out.println("b.MBA");
		break;
		
		case 'c' :System.out.println("c.MTech");
		break;
		
		default:System.out.println("invalid input");
		}
		break;
		
		case 2:System.out.println("2.UG");
		switch(course) {
		
		case 'a' :System.out.println("a.BCA");
		break;
		
		case 'b' :System.out.println("b.BBA");
		break;
		
		case 'c' :System.out.println("c.BTech");
		break;
		
		default:System.out.println("invalid input");
		}
		break;
		
		default :System.out.println("Select valid course");
		
		}
		}



	}


