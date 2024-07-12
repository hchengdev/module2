package Controller;

import Interface.Crud;
import Model.GenuinePhone;
import Model.PortablePhones;

import java.util.List;
import java.util.Scanner;

public class GenuinePhoneManager implements Crud {
    FileProcessing fileProcessing = new FileProcessing();
    List<GenuinePhone> genuinePhones = fileProcessing.gpList();
    static int nextId = 0;

    @Override
    public void addTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {
            System.out.println("┎──────────[ADD]──────────┒");
            System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
            System.out.println("--------------------------------------");
            System.out.print("┠ ▹ Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("┠ ▹ Nhập giá: ");
            double price = Double.parseDouble(scanner.nextLine());
            Validate.validatePrice(price);
            System.out.print("┠ ▹ Nhập số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            Validate.validateQuantity(quantity);
            System.out.print("┠ ▹ Nhập nhà sản xuất: ");
            String manufacturer = scanner.nextLine();
            System.out.print("┠ ▹ Nhập thời gian bảo hành: ");
            String warrantyPeriod = scanner.nextLine();
            Validate.validateWarrantyPeriod(warrantyPeriod);
            System.out.print("┠ ▹ Nhập phạm vi bảo hành: ");
            String warrantyCoverage = scanner.nextLine();
            Validate.validatePortableCountry(warrantyCoverage);

            GenuinePhone gp = new GenuinePhone(++nextId, name, price, quantity, manufacturer, warrantyPeriod, warrantyCoverage);
            this.genuinePhones.add(gp);

            fileProcessing.saveToFileGp();
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }
    }

    @Override
    public void removeTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        System.out.println("┎──────────[REMOVE]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (GenuinePhone gp : genuinePhones) {
            if (gp.getId() == id) {
                genuinePhones.remove(gp);
            }
        }
    }

    @Override
    public void showListTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        for (GenuinePhone gp : genuinePhones) {
            System.out.println(gp);
        }
    }

    @Override
    public void searchTelephoneById(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        System.out.println("┎──────────[SEARCH]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (GenuinePhone gp : genuinePhones) {
            if (gp.getId() == id) {
                System.out.println(gp);
            }
        }
    }

    @Override
    public void searchTelephoneByName(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        System.out.println("┎──────────[SEARCH]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập Name: ");
        String name = scanner.nextLine();
        for (GenuinePhone gp : genuinePhones) {
            if (gp.getName().equals(name)) {
                System.out.println(gp);
            }
        }
    }
}
