package Annotations;

import java.lang.annotation.*;
import java.util.HashMap;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {

    static HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int x) {
        if (cache.containsKey(x)) {
            System.out.println("From cache");
            return cache.get(x);
        }
        int result = x * x;
        cache.put(x, result);
        return result;
    }
}

public class CecheResultCheck {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.square(5));
        System.out.println(c.square(5));
    }
}
