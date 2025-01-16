package java_code_samples;

public class MethodExample {
	
	public int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample mex = new MethodExample();
		int addresult = mex.add(5, 10);
		System.out.println(addresult);
	}

}
