import employee.Employee;
import manager.EmployeeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager em = new EmployeeManager(10);

        while (true) {
            printMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    handleShow(em);
                    break;
                case 2:
                    handleAdd(sc, em);
                    break;
                case 3:
                    handleEdit(sc, em);
                    break;
                case 4:
                    handleDelete(sc, em);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    private static void printMenu() {
        System.out.println("Welcome to QuanLy Nv");
        System.out.println("1. Show");
        System.out.println("2. Add");
        System.out.println("3. Edit");
        System.out.println("4. Delete");
        System.out.println("0. Exit");
    }

    public static void printAddMenu() {
        System.out.println("1. Add Office Employee");
        System.out.println("2. Add Factory Employee");
        System.out.println("3. Add Delivery Employee");
        System.out.println("Press anything else to exit...");
    }

    public static void handleShow(EmployeeManager em) {
        em.showAllEmployee();
        em.showOfficeEmployee();
        em.showDeliveryEmployee();
        em.showFactoryEmployee();
    }

    public static void handleAdd(Scanner sc, EmployeeManager em) {
        printAddMenu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:

        }
    }

}