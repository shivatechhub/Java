package java_code_samples;

public class MultidimensionalArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = {{10,20,30,40},{50,60,70,80}};
		System.out.println("the length of an array is: "+numbers.length);
		
		for(int row=0;row<numbers.length;row++) {
			for(int col=0;col<numbers[row].length;col++) {
	System.out.println("numbers"+"["+row+"]"+"["+col+"]"+"="+numbers[row][col]);
				
			}
		}
		//changing the elements of an array
		numbers[1][1] = 100;
		System.out.println("Array values after changing: \n");
		for(int row=0;row<numbers.length;row++) {
			for(int col=0;col<numbers[row].length;col++) {
				System.out.println("numbers"+"["+row+"]"+"["+col+"]"+"="+numbers[row][col]);
				
			}
		}
		
	
	}
}




