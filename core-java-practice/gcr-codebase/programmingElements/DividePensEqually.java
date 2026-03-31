package programmingElements;

public class DividePensEqually {
	public static void main(String[] args) {
		int numOfStudents = 3;
		int numOfPens = 14;
		
		int equallyDivided = numOfPens / numOfStudents;
		int remaining = numOfPens % numOfStudents;
		
		System.out.println("The pen per student is " + equallyDivided + " and the remaining pen not distributed is " + remaining);
	}
}
