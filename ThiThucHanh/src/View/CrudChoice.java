package View;

import Controller.GenuinePhoneManager;
import Controller.PortablePhonesManager;
import Menu.Menu;

import java.util.Scanner;

public class CrudChoice {
    public static void add(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        Menu.addTelephone();
        int choice = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case 1:
                    manager.addTelephone(scanner, manager, portablePhonesManager);
                    break;
                case 2:
                    portablePhonesManager.addTelephone();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    };
    public static void remove(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        Menu.removeTelephoneM();
        int choice = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case 1:
                    manager.removeTelephone();
                    break;
                case 2:
                    portablePhonesManager.removeTelephone();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    };

    public static void showList(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        Menu.showListMenu();
        int choice = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case 1:
                    manager.showListTelephone();
                    break;
                case 2:
                    portablePhonesManager.showListTelephone();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    };

    public static void search(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        Menu.searchMenu();
        int choice = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case 1:
                    manager.searchTelephone();
                    break;
                case 2:
                    portablePhonesManager.searchTelephone();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    };
}
