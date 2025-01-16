package java_code_samples;

class multilevelinheritencegrandparent {
	public void grandparentclassmethod() {
		System.out.println("This is grandparent Class Method");
	}
}
	
class multilevelinheritenceparent extends multilevelinheritencegrandparent{
	public void parentclassmethod() {
		System.out.println("This is parent Class method");
	}
}

class multilevelchild extends multilevelinheritenceparent{
	public void childclassmethod() {
		System.out.println("This is child class method");
	}
}
	
public class multilevelinheritenceimplementation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multilevelchild mlch = new multilevelchild();
		mlch.grandparentclassmethod();
		mlch.parentclassmethod();
		mlch.childclassmethod();

	}	
}

