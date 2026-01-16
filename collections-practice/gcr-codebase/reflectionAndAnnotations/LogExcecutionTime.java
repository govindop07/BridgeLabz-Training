package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Calculator {

    @LogExecutionTime
    void heavyTask() {
        for (int i = 0; i < 1_000_000; i++);
    }
}

public class LogExcecutionTime {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("heavyTask");

        long start = System.nanoTime();
        m.invoke(c);
        long end = System.nanoTime();

        System.out.println("Execution time: " + (end - start));
    }
}
