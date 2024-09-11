package src.Practice;

public class IntegerToStringToInteger {
    public static void main(String[] args) {
        int a = 123;
        int b = 456;
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        System.out.println(a+b);
        System.out.println(b);
        System.out.println(c+d);
        System.out.println(d);
        int e = Integer.parseInt(c);
        int f = Integer.parseInt(d);
        System.out.println(e+f);
        System.out.println(f);
    }
}
