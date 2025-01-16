package java_code_samples;
import java.io.*; 
	  
	public class ListFunctionExample {
	    public static void main(String args[]) 
	    { 
	  
	        // try-catch block to handle exceptions 
	        try { 
	  
	            // Create a file object 
	            File f = new File("D:\\TRAINING DUMP\\SELENIUM TRAINING"); 
	  
	            // Get all the names of the files present 
	            // in the given directory 
	            String[] files = f.list(); 
	  
	            System.out.println("Files are:"); 
	            System.out.println(files);
	  
	            // Display the names of the files 
	            for (int i = 0; i < files.length; i++) { 
	                System.out.println(files[i]); 
	            } 
	        } 
	        catch (Exception e) { 
	            System.err.println(e.getMessage()); 
	        } 
	    } 
	} 
