package View;

import Controller.GenuinePhoneManager;
import Controller.PortablePhonesManager;
import Menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class CrudChoice {
    public static void add(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {
            boolean flag = true;
            while (flag) {
                Menu.addTelephone();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        manager.addTelephone(scanner, manager, portablePhonesManager);
                        break;
                    case 2:
                        portablePhonesManager.addTelephone(scanner, manager, portablePhonesManager);
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }

    }

    public static void removeTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {

            boolean flag = true;
            while (flag) {
                Menu.removeTelephoneM();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        manager.removeTelephone(scanner, manager, portablePhonesManager);
                        break;
                    case 2:
                        portablePhonesManager.removeTelephone(scanner, manager, portablePhonesManager);
                        break;
                    case 3:
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }
    };

    public static void showList(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {

            boolean flag = true;
            while (flag) {
                Menu.showListMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        manager.showListTelephone(scanner, manager, portablePhonesManager);
                        break;
                    case 2:
                        portablePhonesManager.showListTelephone(scanner, manager, portablePhonesManager);
                        break;
                    case 3:
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }
    };

    public static void search(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {
            boolean flag = true;
            while (flag) {
                Menu.searchMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        searchGp(scanner, manager, portablePhonesManager);
                        break;
                    case 2:
                        searchPp(scanner, manager, portablePhonesManager);
                        break;
                    case 3:
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }
    };

    public static void searchGp(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {
            boolean flag = true;
            while (flag) {
                Menu.search();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        manager.searchTelephoneById(scanner, manager, portablePhonesManager);
                        break;
                    case 2:
                        manager.searchTelephoneByName(scanner, manager, portablePhonesManager);
                        break;
                    case 3:
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }
    }

    public static void searchPp(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager) {
        try {

            boolean flag = true;
            while (flag) {
                Menu.search();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        portablePhonesManager.searchTelephoneById(scanner, manager, portablePhonesManager);
                        break;
                    case 2:
                        portablePhonesManager.searchTelephoneByName(scanner, manager, portablePhonesManager);
                        break;
                    case 3:
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Err" + e.getMessage());
        }
    }
}
