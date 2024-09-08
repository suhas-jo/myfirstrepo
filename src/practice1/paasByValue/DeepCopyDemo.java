package practice1.paasByValue;

public class DeepCopyDemo {

    public static void main(String[] args) {
        Address address = new Address();
        address.street = "abc";
        address.main = "25th Main";
        Student orgStudent = new Student("suhas",31,address);
        System.out.println(orgStudent);

        Student copyStudent = new Student(orgStudent);
        copyStudent.address.street="xyz";
        System.out.println(orgStudent);

    }
}
