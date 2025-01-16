package java_code_samples;

public class AverageMarks {
	static String printgrade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int english = 75;
		int telugu = 75;
		int hindi = 75; 
		float average = (english+telugu+hindi)/3;
		System.out.println(average);
		if(average>=90) {
			printgrade = "distinction";
		}
		else if(average<=89 && average>=60) {
			printgrade = "firstclass";
		}
		else if(average<=59 && average>=35) {
			printgrade = "secondclass";
		}
		else {
			printgrade = "Fail";
		}
		
		switch(printgrade)
		{
		case "distinction":
			System.out.println("Student has passed with distinction");
			break;
		case "firstclass":
		System.out.println("Student has passed with firstclass");
			break;
		case"secondclass":
			System.out.println("Student has passed with distinction");
			break;
		case"Fail":System.out.println("Student has passed with distinction");
		break;
		default: 
			System.out.println("Student is absent for exam");
		}
}

}
