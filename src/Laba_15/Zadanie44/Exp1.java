package Laba_15.Zadanie44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        try {

            int num = scan.nextInt();
            System.out.println("1 - Фибоначчи, 2 - Факториал");
            int n = scan.nextInt();
            System.out.println();

            if(n == 1){
                fib(num);
            }
            if(n == 2){
                factorial(num);
            }
        }
        catch (NumberFormatException | InputMismatchException exc) {
            System.out.println("Исключение уловлено: Ожидалось целое число ");
        }







    }

    static int factorial(int n){
        int result = 1;

        for (int i = 1; i < n+1; i++){
            result *= i;

        }
        System.out.println("factorial = " + result);
        return  result;
    }

    static int fib(int n){
        int n1 = 0;
        int n2 = 1;
        int result = 0;

        for(int i = 0; i < n; i++){
            result = n1 + n2;

            n1 = n2;
            n2 = result;
        }
        System.out.println("fibonachi = "+ result);
        return result;
    }
}
