package java_code_samples;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 50/0;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("Currently in catch block: "+e);
		}
		finally {
			System.out.println("This will always be printed");
		}

	}

}
