package CSV_DataHandling;

import java.io.*;

public class FilterCSV {
	public static void main(String[] args) throws IOException {
		String line;
		BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/Students.csv"));
		
		br.readLine();
		while((line = br.readLine()) != null) {
			String[] data = line.split(",");
			int marks = Integer.parseInt(data[3]);
			if(marks > 80) {
				System.out.println(line);
			}
		}
	}
}
