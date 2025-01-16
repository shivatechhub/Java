package java_code_samples;

public class RecursionExample {
	
	public static int sum(int n) {
		if(n>0) {
			return n+sum(n-1);
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(5);
		System.out.println(result);

	}

}
