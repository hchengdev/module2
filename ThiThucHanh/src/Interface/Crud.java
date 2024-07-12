package Interface;

import Controller.GenuinePhoneManager;
import Controller.PortablePhonesManager;

import java.io.IOException;
import java.util.Scanner;

public interface Crud {

    void addTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager);
    void removeTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager);
    void showListTelephone(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager);


    void searchTelephoneById(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager);
    void searchTelephoneByName(Scanner scanner, GenuinePhoneManager manager, PortablePhonesManager portablePhonesManager);

}
