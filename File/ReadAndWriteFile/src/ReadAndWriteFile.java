import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            if(!file.exists()) {
                throw new FileNotFoundException(fileName);
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + fileName);;
        }
        return list;
    }

    public void writeFile(String fileName, int max) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
