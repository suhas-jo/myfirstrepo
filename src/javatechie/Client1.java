package javatechie;

import java.util.function.Function;

public class Client1 {

    public static void main(String[] args) {

        SquareLambda squareLambda = (i) -> i*i;

        System.out.println(squareLambda.squareTheNumber(3));

        // Using Function
        Function<Integer,String> square = (x) -> "Square of the given number is " + (x*x);

        System.out.println(square.apply(10));

    }
}
