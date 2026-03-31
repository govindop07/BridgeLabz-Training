package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    void process() {}
}

public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        Method m = Software.class.getDeclaredMethod("process");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);

        for (BugReport br : reports) {
            System.out.println(br.description());
        }
    }
}
