/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author huynguyen21
 */
public class RE_J2 {
    // Lam viec voi String
    // Date Time trong Java
    public static void main(String[] args) {
        //RE
        //Được sử dụng để tìm kiếm - thao tác - kiểm tra chuỗi văn bản
        //java.util.regex
        //Matcher và Pattern
        // .: Bất kì kí tự nào
        // *: 0 hoặc nhiều lần lặp
        // +: 1 hoặc nhiều lần lặp
        // ?: 0 hoặc 1 lần lặp
        // ^: Băt đầu một RE
        // $: Kết thúc một RE
        
        // \d: ký tự số 0-9
        // \D: không phải kí tự số
        // \w: ký tự số hoặc chữ
        // \W: không phải kí tự chữ hay số
        // \s: khoảng trắng
        // \S: không phải khoảng trắng
        
        // [...]: bất kì ký tự nào nằm trong []
        // [^...]: không phải các ký tự trong []
        // (): nhóm
        // `: `
        
        String chuan_email = "^[A-Za-z0-9-.+_]+@[A-Za-z0-9.-]+$";
        String patternEmail = "^([\\w%+-_.]+)@([\\w-.]+)\\.([a-zA-z]{2,6})$";
        //^ mở đầu RE
        //A-Za-z0-9-.+_ : Cho người dùng sử dụng dấu cộng
        //+ thứ 2: 1 hoặc nhiều lần lặp [duc1234567]@[gmail.com]
        //$: kết thúc RE
        
        // ""
        String emailRegex = "^[A-Za-z0-9-.+_]+@(gmail.com)$";
        
        String email = "huyguainnt@gmail.com";
        
        //Tạo đối tượng pattern từ biểu thức chính quy
        Pattern pt = Pattern.compile(patternEmail);
        
        //Khớp biểu thức chính quy với chuỗi email
        Matcher mt = pt.matcher(email);
        
        //Kiểm tra xem có khớp hay không
        if (mt.matches()) {
            System.out.println("Email valid!");
        } else {
            System.out.println("Email invalid!");
        }
    }
}
