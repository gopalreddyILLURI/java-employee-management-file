public class Employee {
    int id;
    String name;
    String role;
    double salary;

    public Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String toFileString() {
        return id + "," + name + "," + role + "," + salary;
    }

    public static Employee fromFileString(String line) {
        String[] data = line.split(",");
        return new Employee(
            Integer.parseInt(data[0]),
            data[1],
            data[2],
            Double.parseDouble(data[3])
        );
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + role + " | " + salary;
    }
}
