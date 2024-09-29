/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author huynguyen21
 */
public class Coder extends Person {
    //quan hệ has - a
    //obj hs : name - age-sdt
    
    // obj class:
    private String Programming_Language;
    private ArrayList<Person> liststudent;//aggreation: 1 đối tượng chứa 1 hoặc 
    //nhiều các đối tượng khác 
    //khi đối tượng bị hủy, thì đối tượng trong không bị làm sao
    //=>quan hệ ko chặt chẽ , các đối tượng độc lập nhau 
    
    private Person student; //composition:1 đối tượng chứa 1 đối tượng khác
    //khi đối tượng chứa bị hủy thì đối tượng năm trong nó như 1 thuộc tính 
    //cx sẽ bị hủy theo
    //=> quan hệ chặt chẽ

    public Coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

    public Coder() {
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language(String Programming_Language) {
        this.Programming_Language = Programming_Language;
    }
    
    @Override
    public void getInfor() {
        super.getInfor();
        System.out.println("Program Language: " + this.Programming_Language);
    }
}
