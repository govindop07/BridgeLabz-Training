package CSV_DataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRowsInACSV {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/employees.csv"));
		int totalLines = 0;
		
		br.readLine();
		while(br.readLine() != null) totalLines++;
		
		System.out.println("Total number of lines in employees.csv is: " + totalLines);
	}
}
