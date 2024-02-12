package Laba_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        try {
            System.out.println("Введите корни квадратного уравнения");
            Scanner scan = new Scanner(System.in);
            double a = scan.nextDouble();
            if(a == 0){
                throw  new IllegalArgumentException("Первый коэффициент равен 0");
            }
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double x1;
            double x2;

            double d = (b*b) - 4 * a * c;


            if(d > 0){
                System.out.println("Уравнение имеет 2 корне");
                x1 = (-b - Math.sqrt(d))/(2*a);
                x2 = (-b + Math.sqrt(d))/(2*a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if(d == 0){
                System.out.println("Уравнение умеет 1 корень");
                x1 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("x1 = " + x1);

            }
            else{
                System.out.println("Нет корней");
            }
        }catch (InputMismatchException e){
            System.out.println("Ожидалось число: ");

        }catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
