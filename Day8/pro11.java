package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class pro11 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Anil", "IT", 50000),
                new Employee("Priya", "IT", 50000),
                new Employee("Amit", "IT", 60000),
                new Employee("Rahul", "IT", 50000)
        );


        employees.sort(
                Comparator.comparing((Employee e) -> e.department)
                        .thenComparing(e -> e.name)
        );

        for (Employee e : employees) {
            System.out.println(e.name + " " + e.department + " " + e.salary);
        }
    }
}
