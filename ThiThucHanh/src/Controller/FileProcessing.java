package Controller;

import Model.GenuinePhone;
import Model.PortablePhones;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileProcessing {
    List<GenuinePhone> gpList = new ArrayList<>();
    List<PortablePhones> ppList = new ArrayList<>();
    String gpFilePath = "/Users/nguyenhuutrang/Documents/Codegym/JAVA/module2/ThiThucHanh/src/FileText/gp.csv";
    String ppFilePath = "/Users/nguyenhuutrang/Documents/Codegym/JAVA/module2/ThiThucHanh/src/FileText/pp.csv";

    public FileProcessing() {
        readFromFileGp();
        readFromFilePp();
    }


    public void saveToFileGp() {
        try {
            File file = new File(gpFilePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (GenuinePhone gp : gpList) {
                String line = gp.getId() + "," + gp.getName() + "," + gp.getPrice() + "," + gp.getQuantity() + "," + gp.getManufacturer() + "," + gp.getWarrantyCoverage();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFileGp() {
        try {
            List<String[]> GpList = new ArrayList<String[]>();
            File file = new File(gpFilePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                GpList.add(line.split(","));
            }

            br.close();
            fr.close();

            for (String[] row : GpList) {
                int id = Integer.parseInt(row[0]);
                String name = row[1];
                double price = Double.parseDouble(row[2]);
                int quantity = Integer.parseInt(row[3]);
                String manufacturer = row[4];
                String warrantyPeriod = row[5];
                String warrantyCoverage = row[6];
                GenuinePhone gp = new GenuinePhone(id, name, price, quantity, manufacturer, warrantyPeriod, warrantyCoverage);

                this.gpList.add(gp);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    //PP
    public void saveToFilePp() {
        try {
            File file = new File(ppFilePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (PortablePhones pp : ppList) {
                String line = pp.getId() + "," + pp.getName() + "," + pp.getPrice() + "," + pp.getQuantity() + "," + pp.getManufacturer() + "," + pp.getPortableCountry() + "," + pp.isStatus();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromFilePp() {
        try {
            List<String[]> GpList = new ArrayList<String[]>();
            File file = new File(ppFilePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                GpList.add(line.split(","));
            }

            br.close();
            fr.close();

            for (String[] row : GpList) {
                int id = Integer.parseInt(row[0]);
                String name = row[1];
                double price = Double.parseDouble(row[2]);
                int quantity = Integer.parseInt(row[3]);
                String manufacturer = row[4];
                String portableCountry = row[5];
                boolean status = Boolean.parseBoolean(row[6]);
                PortablePhones pp = new PortablePhones(id, name, price, quantity, manufacturer, portableCountry, status);

                this.ppList.add(pp);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<GenuinePhone> gpList() {
        return gpList;
    }

    public List<PortablePhones> ppList() {
        return ppList;
    }
}
