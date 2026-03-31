package CSV_DataHandling;
import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/CSV_DataHandling/employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Amit,IT,60000\n");
        bw.write("2,Rahul,HR,45000\n");
        bw.write("3,Priya,Finance,55000\n");
        bw.write("4,Neha,IT,70000\n");
        bw.write("5,Suresh,Sales,50000\n");

        bw.close();
        System.out.println("CSV written successfully");
    }
}

