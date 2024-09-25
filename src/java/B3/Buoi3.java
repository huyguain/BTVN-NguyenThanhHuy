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
public class Buoi3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap 2 so: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (true) {
            showGuide();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    System.out.println("Ket qua: " + cong(a, b));
                case 2 ->
                    System.out.println("Ket qua: " + tru(a, b));
                case 3 ->
                    System.out.println("Ket qua: " + nhan(a, b));
                case 4 ->
                    System.out.println("Ket qua: " + chia(a, b));
                case 5 ->
                    System.exit(0);
            }
        }

    }

    private static void showGuide() {
        System.out.println("=======================");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.println("5. Thoat");
        System.out.println("Moi ban lua chon: ");
    }

    private static int cong(int a, int b) {
        return a + b;
    }

    private static int tru(int a, int b) {
        return a - b;
    }

    private static int nhan(int a, int b) {
        return a * b;
    }

    private static double chia(int a, int b) {
        return (double) a / b;
    }
}
