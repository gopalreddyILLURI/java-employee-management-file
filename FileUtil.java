import java.io.*;
import java.util.*;

public class FileUtil {

    private static final String FILE_NAME = "employees.txt";

    public static void saveEmployees(List<Employee> employees) throws IOException {
        FileWriter fw = new FileWriter(FILE_NAME);
        for (Employee e : employees) {
            fw.write(e.toFileString() + "\n");
        }
        fw.close();
    }

    public static List<Employee> loadEmployees() throws IOException {
        List<Employee> list = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) return list;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Employee.fromFileString(line));
        }
        br.close();
        return list;
    }
}
