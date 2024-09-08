package javatechie;

import java.util.List;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<Student> studentList = List.of(
                new Student("suhas",31, List.of("abc.com", "def.com")),
                new Student("sheeba",32, List.of("sheeba.com", "rani.com"))
        );

        // to get the list of names
        System.out.println("Printing names of the students");
        studentList.stream().map(Student::getName).forEach(System.out::println);

        // to get age of all the students
        System.out.println("Printing age of the students");
        studentList.stream().map(Student::getAge).forEach(System.out::println);

        // to get the list of emails of students using map
        System.out.println("Printing emails of students using map");
        studentList.stream().map(Student::getEmail).forEach(System.out::println);

        // to get the list of emails of students using flatMap
        System.out.println("Printing emails of students using flatMap");
        studentList.stream().flatMap(student -> student.getEmail().stream()).forEach(System.out::println);


    }
}
