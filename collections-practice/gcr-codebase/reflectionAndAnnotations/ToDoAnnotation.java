package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {

    @Todo(task = "Add login", assignedTo = "Dev1")
    void login() {}

    @Todo(task = "Optimize DB", assignedTo = "Dev2", priority = "HIGH")
    void database() {}
}

public class ToDoAnnotation {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            Todo t = m.getAnnotation(Todo.class);
            if (t != null) {
                System.out.println(t.task() + " | " + t.assignedTo() + " | " + t.priority());
            }
        }
    }
}
