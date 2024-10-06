/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author huynguyen21
 */
public class MyFile {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter created file name:");
        String fileName = sc.nextLine();

        // Create file
        File file = createFile(fileName);

        // Read file
        System.out.println("Content of file: " + readFile(file));

        // Write file
        writeFile(file);
    }

    // Goi ham createNewFile phải throws IOException
    public static File createFile(String fileName) {
        File file = new File(fileName + ".txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return file;
    }

    public static String readFile(File file) {
        StringBuilder msg = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                msg.append(data).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return msg.toString();
    }

    public static void writeFile(File file) {
        String message = sc.nextLine();
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(message);
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
