/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 * @author huynguyen21
 */
public class StudentManager {

    private ArrayList<Student> listStudent = new ArrayList<>();

    public StudentManager() {
    }

    public void addStudent(Student student) {
        listStudent.add(student);
        System.out.println("Student added successfully");
    }

    public void showListStudent() {
        if (listStudent.isEmpty()) {
            System.out.println("Student list are empty!");
        } else {
            for (Student student : listStudent) {
                System.out.println(student.toString());
            }
        }
    }

    public void editStudent(int id, String name, int age, String major) {
        Student student = findStudent(id);
        if (student != null) {
            student.setName(name);
            student.setAge((age));
            student.setMajor(major);
            System.out.println("Student edited successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public Student findStudent(int id) {
        for (Student student : listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(int id) {
        listStudent.removeIf(student -> student.getId() == id);
    }

    public ArrayList<Student> findByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : listStudent) {
            if (
                    student.getName().toLowerCase()
                            .contains(name.toLowerCase().trim())
            ) {
                students.add(student);
            }
        }
        return students;
    }
}
