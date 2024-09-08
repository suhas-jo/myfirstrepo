package javatechie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args) {
        List<String> strings = List.of("apple","banana", "pear", "cherry","strawberry");

        Optional<String> max = strings.stream().max(Comparator.comparing(String::length));
        System.out.println("Max length  " + max.get());

        String s = strings.stream().min(Comparator.comparing(String::length)).get();

        System.out.println("Min length " + s);
    }
}
