package javatechie;

import java.util.List;
import java.util.OptionalDouble;

public class AvgAgeStudent {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("suhas",31, List.of("abc.com", "def.com")),
                new Student("sheeba",32, List.of("sheeba.com", "rani.com")),
                new Student("suhas",30, List.of("abc.com", "def.com")),
                new Student("sheeba",33, List.of("sheeba.com", "rani.com"))
        );

        OptionalDouble average = studentList.stream().mapToInt(Student::getAge).average();
        System.out.println("Average Age of Students " + average);
    }
}
