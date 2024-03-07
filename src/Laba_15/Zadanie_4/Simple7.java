package Laba13.Zadanie1;
public class Simple7 {
    private String title;
    private String author;
    private int pubDate;

    public Simple7(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }
    public void show() {
        System.out.println("Название книги: " +  title);
        System.out.println("Автор: " + author);
        System.out.println("Дата публикации: " + pubDate);
        System.out.println();
    }
}


