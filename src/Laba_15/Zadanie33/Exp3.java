package Laba_15.Zadanie33;

public class Exp3 {
    public static void main(String[] args) {
        try {
            Exp3.meth();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Стандартное сообщение это: ");
            System.out.println(exc);
            System.out.println("\n трассировка стека: ");
            exc.printStackTrace();
        }

    }
    public static void meth() {
        int[] arr = {1, 2, 3};

        int x = arr[5];
    }
}
