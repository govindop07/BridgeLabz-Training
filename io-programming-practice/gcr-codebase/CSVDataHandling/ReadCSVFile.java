package CSV_DataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
	public static void main(String[] args) throws IOException {		
		String line;
		
		BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/Students.csv"));
		br.readLine();
		try {
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Age: " + data[2] + ", Marks: " + data[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
