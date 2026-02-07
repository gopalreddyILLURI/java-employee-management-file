import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees;

        try {
            employees = FileUtil.loadEmployees();
        } catch (IOException e) {
            employees = new ArrayList<>();
        }

        EmployeeManager manager = new EmployeeManager(employees);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Role: ");
                String role = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                manager.addEmployee(new Employee(id, name, role, salary));
            } else if (choice == 2) {
                manager.viewEmployees();
            } else {
                try {
                    FileUtil.saveEmployees(employees);
                } catch (IOException e) {
                    System.out.println("Error saving data");
                }
                break;
            }
        }
        sc.close();
    }// test change

}
