package javatechie;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class DuplicateNumber {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,1,2,3,4,5,7,8,2,3,4,5,6,7,8);


//        Integer reduce = list.stream().reduce(0, (ans, x) -> ans ^ x);

        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
