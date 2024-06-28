package src;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static String filePath = "C0424G1_Demo_File/data.txt";
    private static File myFile = new File(filePath);
    private static Scanner scanner = new Scanner(System.in);

    public StudentManager() {
    }

    public static void addStudent() throws IOException {
        FileWriter fileWriter = new FileWriter(myFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("----------Enter student information------");
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Student s = new Student(Integer.parseInt(id), name);
        String dataStudent = s.getId() + "," + s.getName();
        // luu vao file
        bufferedWriter.write(dataStudent);
        bufferedWriter.newLine();
        // dong file lai va du data luu lai
        bufferedWriter.close();
    }

    public static void showListStudent() throws IOException {
        FileReader fileReader = new FileReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            // chuyen String ve array su dung split()
            String[] data = line.split(",");
            int idStudent = Integer.parseInt(data[0]);
            String nameStudent = data[1];
            Student s1 = new Student(idStudent, nameStudent);
            System.out.println(s1);
        }
        bufferedReader.close();
    }

    public static void deleteStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",".trim());
            int idStudent = Integer.parseInt(data[0]);
            String name = data[1].replace("/", "");
            Student s1 = new Student(idStudent, name);
            students.add(s1);
        }
        bufferedReader.close();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (id == student.getId()) {
                students.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
        FileWriter fileWriter = new FileWriter(myFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students) {
            bufferedWriter.write(student.getId() + "," + student.getName() + "\n");
        }
        bufferedWriter.close();
    }

    public static void updateStudent() throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            int idStudent = Integer.parseInt(data[0].trim());
            String name = data[1].replace("/", "");
            Student s1 = new Student(idStudent, name);
            students.add(s1);
        }
        bufferedReader.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student name: ");
        String newName = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if(student.getId() == id) {
                student.setName(newName);
                found = true;
                break;
            }
        }
        if (found) {
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Updated student: " + student);
                    break;
                }
            }
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
        FileWriter fileWriter = new FileWriter(myFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students) {
            bufferedWriter.write(student.getId() + "," + student.getName() + "\n");
        }
        bufferedWriter.close();
    }
}
