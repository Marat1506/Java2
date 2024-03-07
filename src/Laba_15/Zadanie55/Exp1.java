package Laba_15.Zadanie55;

public class Exp1 {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chars[] = {'A', 'B', 'C', 'D'};
        for(int i =0; i < 3; i++){
            try{
                if(i == 0)
                    result = a/b;
                else
                    chars[5] = 'X';;
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Исключение уловлено: " + e);
            }
        }
    }
}
