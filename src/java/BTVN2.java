
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author huynguyen21
 */
public class BTVN2 {

    static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    static int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static long divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    static long remain(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("=====================");
        System.out.println("Result:");
        System.out.println("Sum: " + sum(firstNumber, secondNumber));
        System.out.println("Subtract: " + subtract(firstNumber, secondNumber));
        System.out.println("Multi: " + multi(firstNumber, secondNumber));
        System.out.println("Divide: " + divide(firstNumber, secondNumber) + ", remain: " + remain(firstNumber, secondNumber));
    }
}
