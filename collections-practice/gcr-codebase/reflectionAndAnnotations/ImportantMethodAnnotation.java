package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {

    @ImportantMethod
    void critical() {}

    @ImportantMethod(level = "LOW")
    void optional() {}
}

public class ImportantMethodAnnotation {
    public static void main(String[] args) {
        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethodAnnotation.class)) {
                ImportantMethodAnnotation im = m.getAnnotation(ImportantMethodAnnotation.class);
                System.out.println(m.getName() + " -> " + im.level());
            }
        }
    }
}
