package Laba_15.Zadanie33;

import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int len = scan.nextInt();
        try {
            processArray(len);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Превышение границ массива");
        }
    }

    public static void processArray(int len) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[len];
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println("a["+i+"]=");
            arr[i] = scan.nextInt();
        }
    }
}
