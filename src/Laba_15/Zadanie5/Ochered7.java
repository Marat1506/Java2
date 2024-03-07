package Laba_15.Zadanie5;

public class Ochered7 extends Exception {
    int size;
    Ochered7(int s){size = s;}
    public  String toString(){
        return "\n Очередь переполнена: Максимальный размер "+ size;

    }

}
