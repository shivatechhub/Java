package java_code_samples;

public class StringHandlingFunctionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Welcome to Java PProgramming Programming";
		System.out.println(str1.charAt(5)); //m
		System.out.println(str1.codePointAt(5));
		System.out.println(str1.codePointBefore(6));
		System.out.println(str1.codePointCount(0, 5));
		System.out.println(str1.compareTo("Shiva"));
		System.out.println(str1.compareToIgnoreCase("WELCOME TO JAVA PROGRAMMING"));
		System.out.println(str1.concat(" Language"));
		System.out.println(str1.contains("avaj"));
		System.out.println(str1.contentEquals("Programming"));
		System.out.println(str1.contentEquals("Programming"));
		System.out.println(str1.endsWith("Programming"));
		System.out.println(str1.equals("Programming"));
		System.out.println(str1.equalsIgnoreCase("WELCOME TO JAVA PROGRAMMING"));
		System.out.println(str1.hashCode());
		System.out.println(str1.indexOf('c'));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.indexOf('a', 13));
		System.out.println(str1.indexOf("Programming", 27));
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
		System.out.println(str1.lastIndexOf('P'));
		System.out.println(str1.lastIndexOf("Programming"));
		System.out.println(str1.lastIndexOf('P', 30));
		System.out.println(str1.length());
		System.out.println(str1.matches("Welcome to Java PProgramming Programming"));
		System.out.println(str1.replace('P','T'));
		System.out.println(str1.replace("Programming", "Python"));
		System.out.println(str1.replaceAll("Programming", "Replaceall"));
		System.out.println(str1.replaceFirst("Programming", "Replacefirst"));
		System.out.println(str1.startsWith("Welcome"));
		System.out.println(str1.strip());
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(0, 7));
		System.out.println(str1.toCharArray());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
	}

}
