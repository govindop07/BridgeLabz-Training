package CSV_DataHandling;

import java.io.*;

public class JSONToCSV {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("src/CSV_DataHandling/students.json"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/CSV_DataHandling/students.csv"));

        bw.write("ID,Name,Age,Marks\n");

        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("{")) {
                line = line.replace("{", "")
                           .replace("}", "")
                           .replace("\"", "");

                String[] fields = line.split(",");

                String id = fields[0].split(":")[1];
                String name = fields[1].split(":")[1];
                String age = fields[2].split(":")[1];
                String marks = fields[3].split(":")[1];

                bw.write(id + "," + name + "," + age + "," + marks + "\n");
            }
        }

        br.close();
        bw.close();

        System.out.println("JSON converted to CSV successfully");
    }
}
