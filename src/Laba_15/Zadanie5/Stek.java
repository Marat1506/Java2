package Laba_15.Zadanie5;

public class Stek {
    private Ochered9 stack;

    public Stek(int size) {
        stack = new Ochered9(size);
    }

    public void push(char ch) {
        try {
            stack.put(ch);
            System.out.println("Добавлено: " + ch);
        } catch (Ochered7 e) {
            System.out.println(e);
        }
    }

    public void pop() {
        try {
            char ch = stack.get();
            System.out.println("Извлечено: " + ch);
        } catch (Ochered8 e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Stek stack = new Stek(5);

        System.out.println("Добавляем элементы в стек:");
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.push('f');

        System.out.println("\nИзвлекаем элементы из стека:");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
