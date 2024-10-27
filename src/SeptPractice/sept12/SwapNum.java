package src.SeptPractice.sept12;

public class SwapNum {
    public static void main(String[] args) {
        int a = 10,b= 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("After Swap");

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
