package operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=28,num2=20;
		int add,sub,mul,mod;
		float div;
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		mod=num1%num2;
		div=num1/num2;
		System.out.println("add="+add+"\nsub="+sub+"\nmul="+mul+"\nmod="+mod+"\ndiv="+div);
		
		//1.unary -
		int a=20;
		System.out.println(a);
				
		//2.unary not(!)
		boolean b=true;
		System.out.println(!b);
				
		//3.increment ++
		//post incr i++ -> i=i+1
		int i=5;
		i++;
		System.out.println(i);
				
		//pre incr ++i ->i+1
		++i;
		System.out.println(i);
				
		//4.decrement
		//post decr i-- ->i-1
		int j=10;
		j--;
		System.out.println("j--="+j);
				
		//pre decr --i ->i_1
		--j;
		System.out.println("--j="+j);
				
		//5.Bitwise complement
		int n=9;
		System.out.println(~n);
				
		//increment and decrement
		//increment
		//postfix
		int k=10;
		int value=k++;
		System.out.println("k="+value+"\t"+"k="+k);
				
		//prefix
		int value1=++k;
		System.out.println("value="+value1+"\t"+"k="+k);
		
		//decrement
		//postfix
		int value2=k--;
		System.out.println("value="+value2+"\t"+"k="+k);
		
		//prefix
		int value3=--k;
		System.out.println("value="+value3+"\t"+"k="+k);
		
		//relational operator
		//lessthan / equal to
		int x=50,y=100;
		boolean val=x<y;
		boolean val1=x<=y;
		System.out.println(val);
		System.out.println(val1);

		//greaterthan / equal to
		boolean val2=x>y;
		boolean val3=x>=y;
		System.out.println(val2);
		System.out.println(val3);
				
		//not equal to		
		boolean val4=x==y;
		boolean val5=x!=y;
		System.out.println(val4);
		System.out.println(val5);
		
		//ASSIGNMENT OPERATOR
		int numa=28,numb=20;
		int addi,subt,mult,modu;
		float divi;
		addi=numa+=numb;
		subt=numa-=numb;
		mult=numa*=numb;
		modu=numa%=numb;
		divi=numa/=numb;
		System.out.println("add="+addi+"\nsub="+subt+"\nmul="+mult+"\nmod="+modu+"\ndiv="+divi);
		
		//LOGICAL OPERATOR
		int numb1=28,numb2=20;
		boolean a1= numb1==numb2;//false
		boolean b1= numb1!=numb2;//true
		//logical not
		System.out.println("logical not="+!a1);
		//logical and
		System.out.println("logical and="+(a1&&b1));
		//logical or
		System.out.println("logical or="+(a1||b1));
		
		//TERNARY OPERATOR
		int no1=28,no2=20;
		int exp=(no1>no2)?(no1-no2):(no1+no2);
		System.out.println(exp);
		
		//bitwise operators
		int n1=10, n2=5;
		System.out.println("Integer.toBinaryString(n1)");
		System.out.println("Integer.toBinaryString(n2)");
		System.out.println("bitwise or="+(n1|n2));		//bitwise or
		System.out.println("bitwise and="+(n1&n2));//bitwise and
		System.out.println("bitwise xor="+(n1^n2));//bitwise xor
		System.out.println("bitwise complement ~ ="+~(n1));//complement

		
		//shift operator
		int i1=2,j1=-2;
		
		System.out.println(i1+"\t"+Integer.toBinaryString(i1));
		System.out.println(j1+"\t"+Integer.toBinaryString(j1));
		
		System.out.println("shift of i");

		System.out.println("left shift:"+(i1<<2));
		System.out.println(Integer.toBinaryString(i1<<2));
		System.out.println("right shift:"+(i1>>2));
		System.out.println(Integer.toBinaryString(i1>>2));
		System.out.println("unsigned right shift:"+(i1>>>1));
		System.out.println(Integer.toBinaryString(i1>>>1));
		
		System.out.println("shift of j");
		
		System.out.println("left shift:"+(j1<<2));
		System.out.println(Integer.toBinaryString(j1<<2));
		System.out.println("right shift:"+(j1>>2));
		System.out.println(Integer.toBinaryString(j1>>2));
		System.out.println("unsigned right shift:"+(j1>>>1));
		System.out.println(Integer.toBinaryString(j1>>>1));
		

		
		
		

		

		




		

	}

}
