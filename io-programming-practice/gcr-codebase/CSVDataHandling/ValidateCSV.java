package CSV_DataHandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w+$");
        Pattern phonePattern = Pattern.compile("\\d{10}");

        BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/users.csv"));
        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (!emailPattern.matcher(d[2]).matches() ||
                !phonePattern.matcher(d[3]).matches()) {
                System.out.println("Invalid Row: " + line);
            }
        }
        br.close();
    }
}
