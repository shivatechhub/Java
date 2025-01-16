package java_code_samples;

interface multipleinheritenceparent1 {
	public void multipleinheritenceparentmethod1();
}
	
interface multipleinheritenceparent2{
	public void multipleinheritenceparentmethod2();
}

interface multipleinheritenceparent3 extends multipleinheritenceparent1,multipleinheritenceparent2{
	public void multipleinheritenceparentmethod3();
}

class multipleinheritencechildclass implements multipleinheritenceparent3{
	public void multipleinheritencechildclassmethod() {
		System.out.println("This is child class method");
	}

	@Override
	public void multipleinheritenceparentmethod1() {
		// TODO Auto-generated method stub
		System.out.println("This is parent classmethod1");
	}

	@Override
	public void multipleinheritenceparentmethod2() {
		// TODO Auto-generated method stub
		System.out.println("This is parent classmethod2");
	}

	@Override
	public void multipleinheritenceparentmethod3() {
		// TODO Auto-generated method stub
		System.out.println("This is parent classmethod3");
	}
}
	
public class multipleinheritenceimplementation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleinheritencechildclass michclass = new multipleinheritencechildclass();
		michclass.multipleinheritenceparentmethod1();
		michclass.multipleinheritenceparentmethod2();
		michclass.multipleinheritenceparentmethod3();
		michclass.multipleinheritencechildclassmethod();
	}	
}

