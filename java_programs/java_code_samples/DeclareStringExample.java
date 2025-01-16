package java_code_samples;

public class DeclareStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		// declare a char array and then convert it into string
		char[] ch = {'s','h','i','v','a'};
		String str = new String(ch);
		System.out.println("Declaring string using method1: "+str);
		
		//method 2
		//assigning a string using string class
		String st1 = new String("shiva");
		System.out.println("Declaring String using method2: "+st1);
		
		//method 3
		//declaring a variable of string type and assigning a value
		String st2 = "shiva";
		String st3;
		st3 = "krishna";
		System.out.println(st3);
		System.out.println("Declaring String using method3: "+st2);

	}

}
