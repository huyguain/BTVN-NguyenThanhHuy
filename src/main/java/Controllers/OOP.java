/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.Scanner;
import models.Coder;
import java.util.ArrayList;

/**
 *
 * @author huynguyen21
 */
public class OOP {

    public static void main(String[] args) {
        //Parameter: phương thức thongBao(String baocao)
        //Argument: Ở hàm main hay phương khác
        //thongBao("hom nay nghi hoc som hon 30p")

        //từ khóa this: phân biệt biến instance với 
        //biến cục bộ - parameter có cùng tên. 
        //instanceof() -> trả về true false
        //Toán tử instanceof()sẽ được sử dụng để kiểm tra xem 1 
        //đối tượng có thuộc về 1 kiểu dữ liệu cụ thể nào đó hay 
        //không(có thể là lớp hoặc interface)
        ArrayList<Coder> coders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            Coder coder = new Coder();
            
            // Handle Program Language
            showGuide();
            int choice = sc.nextInt();
            switch (choice) {
                case 1 ->
                    coder.setProgramming_Language("Java");
                case 2 ->
                    coder.setProgramming_Language("C");
                case 3 ->
                    coder.setProgramming_Language("C#");
                case 4 ->
                    coder.setProgramming_Language("Python");
                case 5 -> {
                    for (Coder eachCoder : coders) {
                        eachCoder.getInfor();
                    }
                    System.exit(0);
                }
                default ->
                    coder.setProgramming_Language("");
            }
            
            // Handle name
            System.out.println("Enter name");
            String name = sc.next();
            coder.setName(name);
            
            // Handle age
            System.out.println("Enter age:");
            do {
                int age = sc.nextInt();
                coder.setAge(age);
            } while (coder.getAge() == 0);
            
            // Handle phone
            System.out.println("Enter phone:");
            String phone = sc.next();
            coder.setPhone(phone);
            coders.add(coder);
        }

//        System.out.println(coder1 instanceof Person);
//        Person ps1 = new Person();
//        System.out.println(ps1 instanceof Coder);
    }

    private static void showGuide() {
        System.out.println("=======================");
        System.out.println("Enter program language");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. #");
        System.out.println("4. Python");
        System.out.println("5. Exit");
        System.out.println("Please select language: ");
    }
}
