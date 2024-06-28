import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private Scanner scanner;
    private String path;
    private List<Products> productsList;

    public ProductManager() {
        this.scanner = new Scanner(System.in);
        this.productsList = new ArrayList<>();
        path = "products.txt";
        readList();
    }

    public void readList() {
        try {
            FileInputStream fos = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fos);
            this.productsList = (List<Products>) ois.readObject();
            ois.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeList() {
        try {
            FileOutputStream fis = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(this.productsList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addProduct() {

        System.out.println("Enter product id: ");
        int id = Integer.parseInt(this.scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = this.scanner.nextLine();
        System.out.println("Enter product price: ");
        String price = this.scanner.nextLine();

        productsList.add(new Products(id, name, Double.parseDouble(price)));

        writeList();
    }

    public void showList() {
        for (Products p : this.productsList) {
            System.out.println(p);
        }
    }

    public void searchProduct() {
        System.out.println("Enter product id: ");
        int id = Integer.parseInt(this.scanner.nextLine());

        for (Products p : this.productsList) {
            if (p.getId() == id) {
                System.out.println(p);
            }
        }
    }
}
