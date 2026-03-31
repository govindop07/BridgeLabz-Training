package lambdaExpressions;

import java.util.*;

public class PatientIDs {
    public static void main(String[] args) {
        List<String> ids = List.of("P101", "P102", "P103");

        // Lambda version:
        // ids.forEach(id -> System.out.println(id));

        // Method reference version:
        ids.forEach(System.out::println);
    }
}
