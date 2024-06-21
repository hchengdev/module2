import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        student.put("A", 1);
        student.put("D", 5);
        student.put("C", 3);
        student.put("B", 6);

        Map<String, Integer> student2 = new TreeMap<>(student);
        Map<String, Integer> student3 = new LinkedHashMap<>(16, 0.75f, true);
        student3.put("A", 1);
        student3.put("D", 5);
        student3.put("C", 3);
        student3.put("B", 6);

        System.out.println(student3.get("D"));
    }
}