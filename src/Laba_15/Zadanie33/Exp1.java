package Laba_15.Zadanie33;
import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int nums[] = new int[len];
        try{
            System.out.println("Массив не должен содержать более 4 элементов");
            nums[len] = 10;
            System.out.println("Это не будет выедено на экран");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Превышена граница массива");
        }
    }
}