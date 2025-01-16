package java_code_samples;

class hierarchialinheritenceparent {
	public void parentmethod() {
		System.out.println("This is parent Class Method");
	}
}
	
class hierarchialchild1 extends hierarchialinheritenceparent{
	public void childclassmethod1() {
		System.out.println("This is child1 Class method");
	}
}

class hierarchialchild2 extends hierarchialinheritenceparent{
	public void childclassmethod2() {
		System.out.println("This is child2 class method");
	}
}

class hierarchialchild3 extends hierarchialinheritenceparent{
	public void childclassmethod3() {
		System.out.println("This is child3 class method");
	}
}
	
public class hierachialinheritenceimplementation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hierarchialchild1 hc1 = new hierarchialchild1();
		hc1.parentmethod();
		hc1.childclassmethod1();
		
		hierarchialchild2 hc2 = new hierarchialchild2();
		hc2.parentmethod();
		hc2.childclassmethod2();
		
		hierarchialchild3 hc3 = new hierarchialchild3();
		hc3.parentmethod();
		hc3.childclassmethod3();
		
	

	}	
}

