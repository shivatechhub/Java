package java_code_samples;

public class StringCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Shiva";
		String str2 = "shiva";
		String str3 = "Krishna";
		
		//comparing string using method1
		System.out.println("comparing strings using equals() function");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
		//comparing string using method2
		System.out.println("comparing strings using == operator");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		//comparing string using method3
		System.out.println("comparing strings using compareTo method");
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		
		

	}

}
