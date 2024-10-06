/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author huynguyen21
 */
public class Person {
    //access modifiers: Từ khóa chỉ mức độ truy cập của một class, phương thức, biến
    //public: không bị giới hạn truy cập, truy cập từ bất cứ đâu
    //private: chỉ được sử dụng trong class chứa biến, chứa phương thức đó
    //protected: chỉ được sử dụng trong package hoặc class con của nó
    //default: chỉ được sử dụng trong package
    //OOP có 4 thuộc tính: 
    //trừu tượng
    //đóng gói
    //kế thừa
    //đa hình
    //non-access modifiers: 

    private String name;
    private int age;
    private String phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Enter again!");
        } else {
            this.age = age;
        }
    }

    public Person() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfor() {
        System.out.println("=================");
        System.out.println("Name: " + this.name
                + "\nAge: " + this.age
                + "\nPhone numer: " + this.phone);
    }
}
