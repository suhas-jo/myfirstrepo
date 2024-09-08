package javatechie;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {

    // Since this is an abstract method, this will force the class who is implementing to provide an implementation.
    String doPayment(String debtor,String creditor);

    /*
    Backward Compatibility : Before Java 8, interfaces could only have abstract methods.
    If a new method was added to an interface, all implementing classes had to provide an implementation for it.
     Default methods allow new methods to be added to interfaces without breaking existing implementations
     */
    default double applyPromoCode(){
        return new Random().nextDouble();
    }

    /*
    Utility Methods: Static methods in interfaces allow you to define utility methods
    that are related to the interface but do not require an instance of the interface to be used.
    This is useful for methods that perform operations related to the interface but do not depend on
    instance variables
     */
    static String datePatterns(String patterns){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }
}
