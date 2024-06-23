import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Menu: ");
            System.out.println("1. Add Element");
            System.out.println("2. Edit Element");
            System.out.println("3. Remove Element");
            System.out.println("4. Show List");
            System.out.println("5. Search Element By Name");
            System.out.println("6. Show Ascending List");
            System.out.println("7. Show Descending List");
            System.out.println("8. Exit");
            System.out.println("Nhap lua chon cua ban: ");
            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    add(list, scanner);
                    break;
                case 2:
                    edit(list, scanner);
                    break;
                case 3:
                    remove(list, scanner);
                    break;
                case 4:
                    showList(list);
                    break;
                case 5:
                    search(list, scanner);
                    break;
                case 6:
                    showAscendingList(list);
                    break;
                case 7:
                    showDescendingList(list);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
        scanner.close();

    }

    public static void add(ArrayList<Product> list, Scanner scanner) {
        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        list.add(new Product(name, price));
    }

    public static void edit(ArrayList<Product> list, Scanner scanner) {
        System.out.println("Nhap vi tri muon sua:");
        int index = scanner.nextInt();
        scanner.nextLine();


        if (index >= 0 && index < list.size()) {
            System.out.print("Nhap ten moi: ");
            String newName = scanner.nextLine();
            System.out.print("Nhap gia moi: ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine();

            Product product = list.get(index);
            product.setProductName(newName);
            product.setProductPrice(newPrice);
            System.out.println("New List: " + list);
        } else {
            System.out.println("Vi tri khong hop le.");
        }
    }

    public static void remove(ArrayList<Product> list, Scanner scanner) {
        System.out.println("Nhap vi tri muon xoa: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Vi tri khong hop le.");
        }
    }

    public static void showList(ArrayList<Product> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            System.out.println("Danh sach san pham:");
            for (Product product : list) {
                System.out.println(product);
            }
        }
    }

    public static void search(ArrayList<Product> list, Scanner scanner) {
        System.out.println("Nhap vi tri: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        boolean found = false;
        for (Product product : list) {
            if (product.getProductName().equals(name)) {
                System.out.println("San pham tim thay: " + product);
                found = true;
            }
            if (!found) {
                System.out.println("Khong tim thay san pham co ten la: " + name);
            }
        }
    }

    public static void showAscendingList(ArrayList<Product> list) {
        ArrayList<Product> listAscending = new ArrayList<>(list);
        listAscending.sort(Comparator.comparing(Product::getProductPrice));

        System.out.println("Danh sach sap xep theo gia tang dan:");
        for (Product product : listAscending) {
            System.out.println(product);
        }
    }

    public static void showDescendingList(ArrayList<Product> list) {
        ArrayList<Product> sortedList = new ArrayList<>(list);
        sortedList.sort(Comparator.comparing(Product::getProductPrice).reversed());
        System.out.println("Danh sach sap xep theo gia giam dan:");
        for (Product product : sortedList) {
            System.out.println(product);
        }
    }
}