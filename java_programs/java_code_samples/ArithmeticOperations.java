package java_code_samples;

public class ArithmeticOperations {
	public ArithmeticOperations() {
		System.out.println("Performing Arithmetic operations on two numbers");
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public int mod(int a,int b) {
		return a%b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperations aop = new ArithmeticOperations();
		ArithmeticOperations aop1 = new ArithmeticOperations();
		int addresult = aop.add(4, 2);
		int subresult = aop1.sub(4, 2);
		int mulresult = aop.mul(4, 2);
		int divresult = aop.div(4, 2);
		int modresult = aop.mod(4,2);
		System.out.println("sum of two numbers: "+addresult);
		System.out.println("sub of two numbers: "+subresult);
		System.out.println("mul of two numbers: "+mulresult);
		System.out.println("div of two numbers: "+divresult);
		System.out.println("mod of two numbers: "+modresult);
	}
}



