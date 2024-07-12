package View;

import Controller.GenuinePhoneManager;
import Controller.PortablePhonesManager;
import Menu.Menu;

import java.util.Scanner;

public class Telephone {

    public static void telephone(Scanner scanner) {
        GenuinePhoneManager gpm = new GenuinePhoneManager();
        PortablePhonesManager pm = new PortablePhonesManager();


        try {
            boolean flag = true;
            while (flag) {
                Menu.telephoneMenu();

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        CrudChoice.add(scanner, gpm, pm);
                        break;
                    case 2:
                        CrudChoice.removeTelephone(scanner, gpm, pm);
                        break;
                    case 3:
                        CrudChoice.showList(scanner, gpm, pm);
                        break;
                    case 4:
                        CrudChoice.search(scanner, gpm, pm);
                        break;
                    case 5:
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


}