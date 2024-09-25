
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author huynguyen21
 */
public class BTVN2NC {

    static int calculate(int a, int b) {
        if (a > b && a % 2 == 0) {
            return a - b;
        }
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter integer number b: ");
        int b = scanner.nextInt();

        System.out.println("Result: " + calculate(a, b));
    }
}
