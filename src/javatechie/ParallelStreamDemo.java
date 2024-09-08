package javatechie;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1, 100).parallel().forEach( x -> System.out.println(x + " : " + Thread.currentThread().getName()));
    }
}
