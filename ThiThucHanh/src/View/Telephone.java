package View;

import Controller.GenuinePhoneManager;
import Controller.PortablePhonesManager;
import Menu.Menu;

import java.util.Scanner;

public class Telephone {

    public static void telephone(Scanner scanner) {
        GenuinePhoneManager gpm = new GenuinePhoneManager();
        PortablePhonesManager pm = new PortablePhonesManager();
        Menu.telephoneMenu();
        int choice = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case 1:
                    TelephoneCrud.add(scanner, gpm, pm);
                    break;
                case 2:
                    Menu.removeTelephoneM();
                    break;
                case 3:
                    Menu.showListMenu();
                    break;
                case 4:
                    Menu.searchMenu();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }


}