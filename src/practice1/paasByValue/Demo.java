package practice1.paasByValue;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println(list);

        doSomething(list);

        System.out.println(list);
    }

    private static void doSomething(List<Integer> list) {
//        list= new ArrayList<>();
        list.add(50);
    }
}
