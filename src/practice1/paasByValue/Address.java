package practice1.paasByValue;

public class Address {

    String street;
    String main;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", main='" + main + '\'' +
                '}';
    }
}
