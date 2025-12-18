package programmingElements;

public class AveragePercentInPCM {
	public static void main(String[] args) {
		int mathsMarks = 94;
		int physicsMarks = 95;
		int chemistryMarks = 96;
		
		int sumOfMarks = mathsMarks + physicsMarks + chemistryMarks;
		float averagePercent = sumOfMarks / 3;
		
		System.out.println("Sam's average mark in PCM is: " + averagePercent);
	}
}
