package java_code_samples;

public class MethodOverloadingExample {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public float add(float a,float b) {
		return a+b;
	}
	
	public double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample moe = new MethodOverloadingExample();
		int result = moe.add(10,20);
		float result1 = (float) moe.add(5.3, 4.7);
		double result2 = moe.add(25.6, 25.4);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		

	}

}
