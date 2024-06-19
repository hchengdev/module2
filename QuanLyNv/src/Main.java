import employee.DeliveryEmployee;
import employee.Employee;
import employee.FactoryEmployee;
import employee.OfficeEmployee;
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
        if (choice < 1 || choice > 3) {
            return;
        }
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        switch (choice) {
            case 1:
                Employee newOfficeEmploy  = new OfficeEmployee(id, name);
                em.addEmployee(newOfficeEmploy);
            case 2:
                Employee newFactoryEmploy = new FactoryEmployee(id, name);
                em.addEmployee(newFactoryEmploy);
            case 3:
                Employee newDeliveryEmploy = new DeliveryEmployee(id, name);
                em.addEmployee(newDeliveryEmploy);
        }
    }
    public static void handleEdit(Scanner sc, EmployeeManager em) {
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        Employee employee = em.getEmployeeById(id);

        if (em == null) {
            System.out.println("Invalid id");
            return;
        }
        System.out.println("Nhap ten moi:");
        String newName = sc.nextLine();
        employee.setName(newName);
    }
    public static void handleDelete(Scanner sc, EmployeeManager em) {
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        Employee employee = em.getEmployeeById(id);

        if (em == null) {
            System.out.println("Invalid id");
            return;
        }
        em.removeEmployee(employee);
    }
}