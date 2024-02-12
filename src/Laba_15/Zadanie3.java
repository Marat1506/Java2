package Laba_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        try {
            System.out.println("Введите число");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int fact = 1;

            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            System.out.println("Fact = " + fact);
        }catch (InputMismatchException e){
            System.out.println("Ошибка: Ожидалось целое число");
        }

    }
}
