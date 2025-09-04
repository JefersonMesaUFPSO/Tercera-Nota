package main;
import hr.Employee;

public class Main {
    public static void main(String[] args) throws Exception {

    Employee employee1 = new Employee(); 
    employee1.name = "Andres";
    employee1.setSalary(2000000);
    employee1.setRole("Developer");

    Employee employee2 = new Employee(); 
    employee2.name = "Marco";
    employee2.setSalary(1500000);
    employee2.setRole("QA");

    System.out.println(employee1.getName());
    System.out.println(employee1.getSalary());
    System.out.println(employee1.getRole());

    System.out.println(employee2.getName());
    System.out.println(employee2.getSalary());
    System.out.println(employee2.getRole());

    }
}
