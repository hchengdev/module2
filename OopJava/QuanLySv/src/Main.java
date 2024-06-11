import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager(10);

        while (true) {
            printMenu();

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    sm.showStudent();
                    break;
                case 2:
                    handleAdd(sc, sm);
                    break;
                case 3:
                    handleEdit(sc, sm);
                    break;
                case 4:
                    handleDelete(sc, sm);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Hien thi ds.");
        System.out.println("2. Them sv.");
        System.out.println("3. Sua sv.");
        System.out.println("4. Xoa sv.");
        System.out.println("0. Exit");
    }

    public static void handleAdd(Scanner sc, StudentManager sm) {
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());

        Student student = new Student(name, id);
        sm.addStudent(student);
    }

    public static void handleEdit(Scanner sc, StudentManager sm) {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());;
        Student student = sm.getStudent(id);

        if(student == null) {
            System.out.println("khong co sv");
            return;
        }
        System.out.println("Ten moi: ");
        String name = sc.nextLine();
        student.setName(name);
    }
    public static void handleDelete(Scanner sc, StudentManager sm) {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(sc.nextLine());;
        Student student = sm.getStudent(id);
        if(student == null) {
            System.out.println("khong co sv");
            return;
        }
        sm.removeStudent(student);
    }
}
