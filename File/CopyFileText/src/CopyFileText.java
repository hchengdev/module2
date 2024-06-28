import java.io.*;


public class CopyFileText {
    public void copyFileText(String fileNameFrom, String fileNameTo) {
        try {
            FileInputStream fis = new FileInputStream(fileNameFrom);
            FileOutputStream fos = new FileOutputStream(fileNameTo);

            byte[] buffer = new byte[1024];
            int length;
            int totalChars = 0;

            while ((length = fis.read(buffer)) > 0) {
                fis.read(buffer, 0, length);
                totalChars += length;
            }
            System.out.println("Total Chars: " + totalChars);
            fis.close();

        } catch (IOException e) {
            System.err.println("Error copying file " + e.getMessage());
            e.printStackTrace();
        }
    }
}
