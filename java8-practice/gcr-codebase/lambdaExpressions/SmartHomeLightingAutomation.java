package lambdaExpressions;

import java.util.*;
import java.util.stream.Collectors;

public class SmartHomeLightingAutomation {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Asha", "Ravi", "Kiran", "Meera");
		List<String> longNames = names.stream()
		.filter(s -> s.length() > 4)
		.collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println(names.stream().collect(Collectors.toList()));
	}
}
