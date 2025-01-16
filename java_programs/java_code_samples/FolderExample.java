package java_code_samples;

import java.io.File;

public class FolderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("C:\\Users\\shiva_kxblp50\\eclipse-workspace\\testeclipse\\SHIVA TECHUB\\SeleniumJava\\JavaSelenium\\src\\seleniumTraining\\test");
		if(folder.mkdir()) {
			System.out.println("Created the folder. ");
			System.out.println("Deleted the folder status: "+folder.delete());
		}
		else {
			System.out.println("Error deleting the folder.");
		}

	}

}
