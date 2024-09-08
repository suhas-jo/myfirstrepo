package javatechie;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinter {

    private static Object object=new Object();

    private static IntPredicate oddCondition = x -> x%2!=0;
    private static IntPredicate evenConition = x -> x%2 == 0;

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(()-> EvenOddPrinter.printNumber(oddCondition));
        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(evenConition));
        Thread.sleep(1000);
    }

    public static void printNumber(IntPredicate conition){
        IntStream.rangeClosed(1,10).filter(conition).forEach(EvenOddPrinter::execute);
    }

    public static void execute(int n){
        synchronized (object){
            try{
                System.out.println(Thread.currentThread().getName()+ " : " + n);

                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
