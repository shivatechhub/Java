package java_code_samples;

public class MethodsWithoutParameters {

	public void printname() {
		System.out.println("Shiva Krishna");
	}
	public void printanothername() {
		System.out.println("Gayathri");
	}
	public int addtwonumbers() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		return a+b;
	}
	public int addtwonumberswithparameters(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsWithoutParameters mwop = new MethodsWithoutParameters();
		mwop.printname();
		mwop.printanothername();
		mwop.printname();
		mwop.printanothername();
		mwop.printname();
		mwop.addtwonumbers();
		mwop.addtwonumbers();
		mwop.addtwonumbers();
		
		mwop.addtwonumberswithparameters(10,20);
		mwop.addtwonumberswithparameters(50,60);
		mwop.addtwonumberswithparameters(70,80);
	}

}
