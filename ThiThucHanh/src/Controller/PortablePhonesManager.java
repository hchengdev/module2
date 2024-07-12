package Controller;

import Interface.Crud;
import Model.GenuinePhone;
import Model.PortablePhones;

import java.util.List;
import java.util.Scanner;

public class PortablePhonesManager implements Crud {

    FileProcessing fileProcessing = new FileProcessing();
    List<PortablePhones> portablePhones = fileProcessing.ppList();
    static int nextId = 0;

    @Override
    public void addTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        System.out.println("┎──────────[ADD]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("┠ ▹ Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("┠ ▹ Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("┠ ▹ Nhập nhà sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("┠ ▹ Nhập quốc gia nhập khẩu: ");
        String portableCountry = scanner.nextLine();
        System.out.print("┠ ▹ Nhập trạng sử dụng: ");
        String ststus = scanner.nextLine();

        PortablePhones pp = new PortablePhones(++nextId, name, price, quantity, manufacturer, portableCountry,ststus);
        this.portablePhones.add(pp);

        fileProcessing.saveToFilePp();
    }

    @Override
    public void removeTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        System.out.println("┎──────────[REMOVE]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (PortablePhones pp : portablePhones) {
            if (pp.getId() == id) {
                portablePhones.remove(pp);
            }
        }
    }

    @Override
    public void showListTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        for (PortablePhones pp : portablePhones) {
            System.out.println(pp);
        }
    }

    @Override
    public void searchTelephoneById(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        System.out.println("┎──────────[SEARCH]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (PortablePhones pp : portablePhones) {
            if (pp.getId() == id) {
                System.out.println(pp);
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
        for (PortablePhones pp : portablePhones) {
            if (pp.getName().equals(name)) {
                System.out.println(pp);
            }
        }
    }

}
