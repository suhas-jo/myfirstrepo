package javatechie;

import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.*;


public class CharFrequencyCount {

    public static void main(String[] args) {

        String input = "helloWorld";

        Map<Character,Long> freqMap = input.chars().mapToObj(x->(char)x).collect(
                groupingBy(Function.identity(),counting())
        );

        System.out.println(freqMap);
    }
}
