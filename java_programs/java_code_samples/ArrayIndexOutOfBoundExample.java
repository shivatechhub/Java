package java_code_samples;

public class ArrayIndexOutOfBoundExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "Shiva"; //null pointer exception
			System.out.println(s.length());
			
			int div = 50/5;
			System.out.println(div);
			
			int a[] = new int[5];
			a[10] = 100;
			System.out.println(a);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NullPointerException n) {
			System.out.println(n);
		}catch(ArithmeticException x) {
			System.out.println(x);
		}
		finally {
			System.out.println("This will always be printed.");
		}

	}

}
