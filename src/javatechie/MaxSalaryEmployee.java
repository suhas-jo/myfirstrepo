package javatechie;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MaxSalaryEmployee  {

    public static void main(String[] args) {

        List<Employee> employeeList = List.of(
                new Employee(1,"suhas", "DEV", 999),
                new Employee(2,"sheeba", "QA", 201206),
                new Employee(3,"vinay", "DEV", 10000),
                new Employee(4,"shabi", "QA", 20122),
                new Employee(1,"rudresh", "DEVOPS", 10000),
                new Employee(2,"ajay", "QA", 20120),
                new Employee(3,"prathap", "DEVOPS", 10000),
                new Employee(4,"Rani", "DEVOPS", 20122)
        );

        Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);

        System.out.println("Max Salary " + employeeList.stream().max(salaryComparator).get().getSalary());
        System.out.println("Min Salary " + employeeList.stream().min(salaryComparator).get().getSalary());

        Map<String, Optional<Employee>> maxSalBydept1 = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(salaryComparator)))
        );

        System.out.println(maxSalBydept1);

        Map<String, Employee> maxSalBydept2 = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(salaryComparator),Optional::get)
                )
        );

        System.out.println(maxSalBydept2);
    }
}
