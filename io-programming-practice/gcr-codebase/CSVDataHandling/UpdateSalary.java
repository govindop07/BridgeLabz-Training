package CSV_DataHandling;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/CSV_DataHandling/updated_employees.csv"));

        bw.write(br.readLine() + "\n");
        String line;

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equalsIgnoreCase("IT")) {
                double salary = Double.parseDouble(d[3]);
                salary *= 1.10;
                d[3] = String.valueOf(salary);
            }
            bw.write(String.join(",", d) + "\n");
        }
        br.close();
        bw.close();
    }
}
