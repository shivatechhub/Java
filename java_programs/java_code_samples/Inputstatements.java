package java_code_samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputstatements {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 Two ways to read the input from the console
		 1. BufferedReader
		 2. Scanner
		 */
		System.out.println("Enter your name using buffered reader");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println(name);
		
		System.out.println("Enter your name using scanner");
		Scanner sc = new Scanner(System.in);
		String namescanner = sc.nextLine();
		System.out.println(namescanner);
		
	}

}
