package src;

public class elseifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";
		if(browser=="safari") {
			System.out.println("safari");
		}
		else if(browser=="edge") {
			System.out.println("edge is open");
		}
		else if(browser=="chrome") {
			System.out.println("chrome is opening");
		}
		else if(browser=="firefox") {
			System.out.println("firefox opens");
		}
		else {
			System.out.println("invalid browser");
		}

	}

}
