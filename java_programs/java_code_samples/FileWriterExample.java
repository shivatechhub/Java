package java_code_samples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\shiva_kxblp50\\eclipse-workspace\\testeclipse\\SHIVA TECHUB\\SeleniumJava\\JavaSelenium\\src\\seleniumTraining\\samplefile.txt");	
		
		//write to a file using file writer. 
		FileWriter fw = new FileWriter(file);
		fw.write("Hello World Welcome to Java Programming");
		fw.close();
		System.out.println("Successfully wrote to the file.");
		
		//Read a file using scanner
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}

}
