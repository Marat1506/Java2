package Laba_15.Zadanie_4;

import Laba13.Zadanie1.Simple7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple8  {
    public static void main(String[] args) {
        Simple7 books[] = new Simple7[5];
        Scanner scan = new Scanner(System.in);
        int i = 0;

        try {
            while (i < 5) {
                System.out.println("Введите название книги (или 'q' для выхода):");
                String title = scan.nextLine();
                System.out.println("Введите автора книги:");
                String author = scan.nextLine();

                if (isNumber(title) || isNumber(author)) {
                    throw new InputMismatchException("Ошибка: ожидались строки");
                }
                if (title.equals("q")) {
                    break;
                }


                System.out.println("Введите год публикации:");
                int pubDate = scan.nextInt();

                if (pubDate < 0){
                    throw new InputMismatchException("Ошибка: ожидалось положительное число");
                }



                books[i] = new Simple7(title, author, pubDate);

                i++;
            }
        }catch (InputMismatchException e){
            if (e.getMessage() != null)
                System.out.println(e.getMessage());
            else System.out.println("Ошибка: Ожидалось целое число");
        }

        for(int j= 0; j < books.length; j++){
            if (books[j] != null) {
                books[j].show();
            }

        }

    }

    static boolean isNumber(String str) {
        if (str.startsWith("-")) {
            str = str.substring(1); // Игнорируем минус
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
