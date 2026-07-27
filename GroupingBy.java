import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

public class GroupingBy {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Mayank", "IT"),
                new Employee("Rahul", "HR"),
                new Employee("Amit", "IT"),
                new Employee("Neha", "HR"),
                new Employee("Riya", "Sales")
        );

        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(byDept);

//       f,
//        Map<String, Long> countByDept = employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getDept,
//                        Collectors.counting()
//                ));

        //System.out.println(countByDept);
    }
}