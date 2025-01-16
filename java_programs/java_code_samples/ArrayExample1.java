package java_code_samples;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,30,50,70,90};
		
		//looping through an array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//accessing the elements of an array print 70
		System.out.println(a[3]);
		
		//changing the element of an array
		a[3] = 100;
		System.out.println(a[3]); //100
		
		//printing the length of an array
		System.out.print("The number of elements in an array are:"+a.length);
		
		//printing the elements of an array using foreach
		System.out.println("\nprinting the elements of an array using foreach");
		for (int i : a) {
			System.out.println(i);
		}
	}
}
