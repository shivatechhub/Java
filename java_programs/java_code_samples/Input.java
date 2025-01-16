package java_code_samples;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}

	}

}
