package java_code_samples;

class singleinheritenceparentclass {
	public void ParentClassMethod() {
		System.out.println("This is Parent Class Method");
	}
}
	
class singleinheritencechildclass extends singleinheritenceparentclass{
	public void childclassmethod() {
		System.out.println("This is Child Class method");
	}
}
	
public class singleinheritenceimplementation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleinheritencechildclass shc = new singleinheritencechildclass();
		shc.ParentClassMethod();
		shc.childclassmethod();

	}	
}

