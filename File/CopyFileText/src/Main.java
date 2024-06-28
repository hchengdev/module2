import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.err.println("Tệp nguồn không tồn tại.");
            scanner.close();
            return;
        }
        if (!targetFile.exists()) {
            System.err.println("Tệp nguồn không tồn tại.");
            scanner.close();
            return;
        }

        CopyFileText copyFileText = new CopyFileText();
        copyFileText.copyFileText(sourcePath, targetPath);
        scanner.close();
    }
}