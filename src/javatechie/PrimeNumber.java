package javatechie;

import java.util.List;

public class PrimeNumber {

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n) ;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static List<Integer> list = List.of(3,4,5,6,7,2,3,4,5,61,34,565,232,12,32);

    public static void main(String[] args) {
        list.stream().filter(PrimeNumber::isPrime).forEach(System.out::println);

//        list.forEach(System.out::println);
    }
}
