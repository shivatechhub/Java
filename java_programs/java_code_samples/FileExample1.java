package java_code_samples;

import java.io.File;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\shiva_kxblp50\\eclipse-workspace\\testeclipse\\SHIVA TECHUB\\SeleniumJava\\JavaSelenium\\src\\seleniumTraining\\samplefile.txt");	
			if(file.createNewFile()) {
				System.out.println("File is Created: "+file.getName());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.canExecute());
				System.out.println(file.exists());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.length());
				System.out.println(file.delete());
			}
			else {
				System.out.println("File already exists. ");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
