package methodsandconstructor;

public class parametrisedmethod {
	float area;
	public parametrisedmethod(float l,float b) {
		// TODO Auto-generated method stub
		area=l*b;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parametrisedmethod ob=new parametrisedmethod(4.6f,8.7f);


	}

}
