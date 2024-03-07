package Laba_16.Zadanie1;

import java.io.IOException;

public class Example4 {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];
        System.out.println("Введите несколько членов.");
        System.out.println(data);
        System.in.read(data);
        System.out.println("Вы вели: ");

        for(int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);
    }
}
