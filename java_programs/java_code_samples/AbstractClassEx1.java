package java_code_samples;

abstract class AbstractClassEx {
	abstract void printinformation();
}

class childclassabstract extends AbstractClassEx{
	public void printinformation() {
		int age = 36;
		String name = "Shiva";
		String Company = "Bosch";
		System.out.println("Name of the employee: "+name);
		System.out.println("Company: "+Company);
		System.out.println("Age of employee: "+age);
	}
}

class AbstractClassEx1{
	public static void main(String args[]) {
		AbstractClassEx chab = new childclassabstract();
		chab.printinformation();
	}
}

