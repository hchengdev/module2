import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : students){
            System.out.println(st.toString());
        }
    }
}