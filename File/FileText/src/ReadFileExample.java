import java.io.*;

public class ReadFileExample {
    public void readFileText(String fileName) throws IOException {
        try{
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bf.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

}
