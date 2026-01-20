package CSV_DataHandling;

import java.io.*;

public class SearchAnEmployee {
	public static void main(String[] args) throws IOException {
		String searchName = "Amit";
		BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/employees.csv"));
		
		String line;
		br.readLine();
		while((line = br.readLine()) != null) {
			String[] data = line.split(",");

			if(data[1].toLowerCase().equals(searchName.toLowerCase() )) {
				System.out.println("Department: " + data[2]);
				System.out.println("Salary: " + data[3]);
				break;
			}
			
		}
	}
}
