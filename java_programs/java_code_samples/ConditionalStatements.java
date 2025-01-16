package java_code_samples;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operation = "add";
		int a = 50;
		int b = 10;
		
		if(operation == "add") {
			System.out.println(a+b);
		}
		
		else if(operation == "minus") {
			System.out.println(a-b);
		}
		else if(operation == "multiple") {
			System.out.println(a*b);
		}
		else if(operation == "division") {
			System.out.println(a/b);
		}
		else {
			System.out.println("invalid operation");
		}
}
}
