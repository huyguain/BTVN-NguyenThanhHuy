/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3;

import java.util.Scanner;

/**
 *
 * @author huynguyen21
 */
public class B31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        while (a < 1) {
            System.out.print("Enter integer a: ");
            a = scanner.nextInt();
        }

        int temp = a;

        while (temp < a + 6) {
            System.out.println(temp);
            temp = temp + 1;
        }
    }
}
