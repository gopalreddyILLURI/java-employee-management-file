import java.util.*;

public class EmployeeManager {
    List<Employee> employees;

    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void viewEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
