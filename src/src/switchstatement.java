package src;

public class switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="edge";
		switch(browser) {
		case "chrome":System.out.println("chrome is open");
		break;
		
		case "firefox":System.out.println("firefox is open");
		break;
		
		case "edge":System.out.println("edge is open");
		break;
		
		default:System.out.println("invalid browser");
		}

	}

}
