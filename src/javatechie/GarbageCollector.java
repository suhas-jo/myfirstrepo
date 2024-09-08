package javatechie;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GarbageCollector {

    public static void main(String[] args) {

//        String s1= new String("suhas");
//
//        s1 = null;

        GarbageCollector garbageCollector = new GarbageCollector();
        garbageCollector.finalize();
        garbageCollector = null;

        WeakReference wf = new WeakReference(new Employee(1,"suhas","hr",234));


        System.gc();

        System.out.println("End of main");
    }

    public void finalize(){
        System.out.println("GarbageCollector Class finalize method...");
        System.out.println(10/0);
    }
}
