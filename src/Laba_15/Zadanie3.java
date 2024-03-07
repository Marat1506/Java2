package Laba_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        try {
            System.out.println("Введите число");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            if(num < 0){
                throw new IllegalArgumentException("Ошибка ввода: ожидалось положительное число");
            }

            int fact = 1;

            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }catch (InputMismatchException e){
            System.out.println("Ошибка: Ожидалось целое число");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
