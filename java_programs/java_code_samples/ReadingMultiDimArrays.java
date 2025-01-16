package java_code_samples;

public class ReadingMultiDimArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]muldim = {{10,20,30},{40,50,60}};
		
		for(int[] rows:muldim) {
			for(int val:rows) {
				System.out.println(val);
			}
			
		}

	}

}
