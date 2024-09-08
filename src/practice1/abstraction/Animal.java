package practice1.abstraction;

public abstract class Animal {

    private String name;
    Animal(String name){
        System.out.println("Animal Constructor is called...");
        this.name=name;
    }

    public abstract void makeSound();

    public String getName(){
        return this.name;
    }
}

class  Dog extends Animal{
    private int age;

    Dog(String name,int age) {
        super(name);
        this.age = age;
        System.out.println("Dog Constructor is called..");
    }

    @Override
    public void makeSound() {
        System.out.println("Bow..Bow...Bow");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal{

    Cat(String name) {
        super(name);
        System.out.println("Cat Constructor is Called..");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow...Meow..");
    }

}
