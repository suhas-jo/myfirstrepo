package javatechie;

public class Paytm implements UPIPayment{
    @Override
    public String doPayment(String debtor, String creditor) {
        return "payment made through paytm";
    }
}
