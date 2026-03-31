package JSONData;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;

public class StudentJSON {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Govind");
        student.put("age", 22);

        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("OS");

        student.set("subjects", subjects);

        System.out.println(student.toPrettyString());
    }
}
