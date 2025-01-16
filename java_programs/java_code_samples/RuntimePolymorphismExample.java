package java_code_samples;

class RuntimePolymorphismMethods {
	
	public void print() {
		System.out.println("This is parent class print method");
	}
}
	
class childclass1 extends RuntimePolymorphismMethods{
	public void print() {
		System.out.println("This is childclass1 print method");
	}
}

class childclass2 extends RuntimePolymorphismMethods{
	public void printchild() {
		System.out.println("This is childclass2 print method");
	}
}

class RuntimePolymorphismExample{
	public static void main(String args[]) {
		RuntimePolymorphismMethods rtpm = new RuntimePolymorphismMethods();
		rtpm.print();
		childclass1 ch1 = new childclass1();
		ch1.print();
		childclass2 ch2 = new childclass2();
		ch2.print();
	}
}
	


