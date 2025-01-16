package java_code_samples;

public class BreakandContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example using break
		System.out.println("Example using break");
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		//example using continue
		System.out.println("Example using Continue");
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
