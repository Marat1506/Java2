package Laba_15.Zadanie5;

public class Ochered9 implements Ochered1 {
    private char q[];
    private  int putloc, getloc;

    public  Ochered9(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    public void put(char ch) throws Ochered7{
        if(putloc == q.length - 1) throw new Ochered7(q.length-1);
        putloc++;
        q[putloc] = ch;
    }

    public char get() throws Ochered8 {
        if(getloc == putloc){
            throw new Ochered8();
        }
        getloc++;
        return q[getloc];
    }

}
