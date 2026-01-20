package CSV_DataHandling;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("src/CSV_DataHandling/students1.csv"));
        br1.readLine();
        String line;
        while ((line = br1.readLine()) != null) {
            String[] d = line.split(",");
            map.put(d[0], d);
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader("src/CSV_DataHandling/students2.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/CSV_DataHandling/merged.csv"));

        bw.write("ID,Name,Age,Marks,Grade\n");
        br2.readLine();

        while ((line = br2.readLine()) != null) {
            String[] d2 = line.split(",");
            String[] d1 = map.get(d2[0]);
            bw.write(d1[0] + "," + d1[1] + "," + d1[2] + "," + d2[1] + "," + d2[2] + "\n");
        }
        br2.close();
        bw.close();
    }
}
