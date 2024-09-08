package javatechie;

public class RunnableDemo {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Annonymous class run method...");
            }
        };
        new Thread(runnable).start();

        Runnable lambdaRun = () -> System.out.println("Lambda run");

        new Thread(lambdaRun).start();
    }
}
