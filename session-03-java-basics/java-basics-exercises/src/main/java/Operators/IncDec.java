package Operators;

public class IncDec {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = --b;
        // b = b-1, c = b ----> 1


        d = a--;
        // d = a, a = a-1 ----> d = 1, a = -1
        c--;
        System.out.println("a = " + a++);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a = " + a);


    }
}
