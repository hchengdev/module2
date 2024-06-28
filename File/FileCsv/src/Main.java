import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        List<Country> countries = new ArrayList<>();
        File file = new File("src/world.txt");
        if (!file.exists()) {
            System.err.println("Tệp không tồn tại.");
            return;
        }


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String code = values[1].replace("\"", "");
                String name = values[2].replace("\"", "");
                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}