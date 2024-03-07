package Laba_15.Zadanie4;

public class Simple8 {
    public static void main(String[] args) {

        try {
            Simple7  books[] = new Simple7[5];
            books[0] = new Simple7("Java: A Beginer's Guide", "Schildt", 2014);
            books[1] = new Simple7("Java: A Beginer's Guide", "Schildt", 2014);
            books[2] = new Simple7("Java: A Beginer's Guide", "Schildt", 2014);
            books[3] = new Simple7("Java: A Beginer's Guide", "Schildt", 2014);
            books[4] = new Simple7("Java: A Beginer's Guide", "Schildt", 2014);
            books[5] = new Simple7("Java: A Beginer's Guide", "Schildt", 2014);


            for(int i = 0; i < books.length; i++){
                books[i].show();
            }
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за границы массива");
        }

    }
}
