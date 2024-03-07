package Laba_15.Zadanie4;

public class Simple7 {
    private String title;
    private  String author;
    private int pubDate;

    public Simple7(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
