package Laba_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите строку");
            String str = scan.nextLine();
            System.out.println("Введите диапазон");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            char[] mass = new char[str.length()];
            char[] newMass = new char[num2 - num1 + 1];

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                mass[i] = ch;
            }
            int j = 0;
            for (int i = num1; i < str.length() - (num2 - num1) + 1; i++) {
                newMass[j] = mass[i];
                j++;
            }

            for (int i = 0; i < newMass.length; i++) {
                System.out.print(newMass[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: ожидалось целое число");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы строки");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
