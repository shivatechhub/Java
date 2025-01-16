package java_code_samples;

interface Interface1{
	void method1();
	void method21();
}

interface Interface2 extends Interface1{
	void method31();
}

public class InterfaceExample3 implements Interface2 {
	public void method1()
	{
		System.out.println("Inside method1");
	}
	public void method21() {
		System.out.println("Inside method21");
	}
	public void method31() {
		System.out.println("Inside method3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample3 inex3 = new InterfaceExample3();
		inex3.method1();
		inex3.method21();
		inex3.method31();
	}
}
