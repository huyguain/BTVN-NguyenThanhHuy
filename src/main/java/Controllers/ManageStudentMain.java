/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import java.util.Scanner;

import models.Student;
import models.StudentManager;

/**
 * @author huynguyen21
 */
public class ManageStudentMain {
    public static final StudentManager manager = new StudentManager();
    public static final Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Xem danh sách học sinh");
        System.out.println("2. Thêm học sinh");
        System.out.println("3. Sửa học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Tìm theo tên");
        System.out.println("6. Thoát");
        System.out.println("Chọn một tác vụ: ");
    }

    public static void viewListStudents() {
        System.out.println("Student list:");
        manager.showListStudent();
    }

    public static void addStudent() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter major: ");
        String major = sc.nextLine();
        Student student = new Student(name, age, major);
        manager.addStudent(student);
    }

    public static void updateStudent() {
        System.out.println("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter major: ");
        String major = sc.nextLine();
        manager.editStudent(id, name, age, major);
    }

    public static void deleteStudent() {
        System.out.println("Enter ID to delete: ");
        int id = sc.nextInt();
        manager.deleteStudent(id);
    }

    public static void searchByName() {
        System.out.println("Search by name: ");
        String name = sc.nextLine();
        ArrayList<Student> students = manager.findByName(name);
        if (students.isEmpty()) {
            System.out.println("Student not found");
        } else {
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1 -> viewListStudents();
            case 2 -> addStudent();
            case 3 -> updateStudent();
            case 4 -> deleteStudent();
            case 5 -> searchByName();
            case 6 -> System.exit(0);
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            handleChoice(choice);
        }
    }
}
