package java_code_samples;

public class LoopControlStatementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing numbers 1-10 using for loop
		System.out.println("Printing numbers using for loop");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		//printing numbers 1-10 using while loop
		System.out.println("Printing numbers using while loop");
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//printing numbers 1-10 using do while loop
		System.out.println("Printing numbers using do while loop");
		int i1=1;
		do {
			System.out.println(i1);
			i1++;
		}while(i1<=10);
		
		//printing numbers from 1-10 using foreach loop
		System.out.println("printing numbers from 1-10 using foreach loop");
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i2 : a) {
			System.out.println(i2);
			
		}
			
	}

}
