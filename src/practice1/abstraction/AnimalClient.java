package practice1.abstraction;

public class AnimalClient {

    public static void main(String[] args) {
        Animal myDog = new Dog("jonny",12);
        Animal myCat = new Cat("pussy");

        myDog.makeSound();
        myCat.makeSound();

        System.out.println(myDog.getName());

    }
}
