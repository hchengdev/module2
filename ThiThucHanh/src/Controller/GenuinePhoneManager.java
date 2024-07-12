package Controller;

import Interface.Crud;
import Model.GenuinePhone;
import Model.PortablePhones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenuinePhoneManager implements Crud {
    FileProcessing fileProcessing = new FileProcessing();
    List<GenuinePhone> genuinePhones = fileProcessing.gpList();
    List<PortablePhones> portablePhones = fileProcessing.ppList();

    @Override
    public void addTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) throws IOException {
        int nextId = 1;
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
        System.out.print("┠ ▹ Nhập thời gian bảo hành: ");
        String warrantyPeriod = scanner.nextLine();
        System.out.print("┠ ▹ Nhập phạm vi bảo hành: ");
        String warrantyCoverage = scanner.nextLine();

        GenuinePhone gp = new GenuinePhone(inextId++, name, price, quantity, manufacturer, warrantyPeriod, warrantyCoverage);
        this.genuinePhones.add(gp);

        saveToFileRoom();
    }

    @Override
    public void removeTelephone() {

    }

    @Override
    public void showListTelephone() {

    }

    @Override
    public void searchTelephone() {

    }


    public void addTelephone() {
    }
}
