package Laba_15.Zadanie5;

public class Ochered10 {
    public static void main(String[] args) {
        Ochered9 q1 = new Ochered9(10);
        char ch;
        int i;
        try {
            for(i = 0; i < 11; i++){
                System.out.println("Попытка сохранения: " + (char) ('A' + i));
                q1.put((char) ('A' + i));
                System.out.println(" - OK");

            }
            System.out.println();
        }catch (Ochered7 exc){
            System.out.println(exc);
        }
        System.out.println();

        try{
            for(i = 0; i < 11; i++){
                System.out.println("Получение следующего символа: ");
                ch = q1.get();
                System.out.println(ch);
            }
        }catch (Ochered8 exc) {
            System.out.println(exc);
        }
    }
}
