package CSV_DataHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadEncryptedCSV {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("secure_employees.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            System.out.println(
                "ID: " + d[0] +
                ", Name: " + d[1] +
                ", Email: " + CryptoUtil.decrypt(d[2]) +
                ", Salary: " + CryptoUtil.decrypt(d[3])
            );
        }
        br.close();
    }
}
