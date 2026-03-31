package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Govind")
    void completeTask() {}
}

public class CustomAnnotation {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getDeclaredMethod("completeTask");
        TaskInfo info = method.getAnnotation(TaskInfo.class);

        System.out.println(info.priority());
        System.out.println(info.assignedTo());
    }
}
