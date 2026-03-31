package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name = "user_name")
    String username;

    User(String username) {
        this.username = username;
    }
}

public class JSONField {
    public static void main(String[] args) throws Exception {
        User u = new User("Govind");
        StringBuilder json = new StringBuilder("{");

        for (Field f : u.getClass().getDeclaredFields()) {
            JsonField jf = f.getAnnotation(JsonField.class);
            if (jf != null) {
                json.append("\"")
                    .append(jf.name())
                    .append("\":\"")
                    .append(f.get(u))
                    .append("\"");
            }
        }
        json.append("}");
        System.out.println(json);
    }
}
