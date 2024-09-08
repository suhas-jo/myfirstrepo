package javatechie;

import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (x) -> x>10;

        List<Integer> list = List.of(12,3,4,5,6,75,4,34,23);

        list.stream().filter(predicate).sorted().forEach(System.out::println);

        list.stream().filter(x -> x%2 ==0).sorted().forEach(FilterDemo::m1);

        FilterDemo filterDemo = new FilterDemo();
        list.stream().filter(x -> x%2 ==0).sorted().forEach(filterDemo::m2);
    }

    public static void m1(int x){
        System.out.println("printing from static method -> " + x);
    }

    public void m2(int x){
        System.out.println("printing from non static method -> " + x);
    }
}
