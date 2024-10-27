package src.SeptPractice.sept12;

public class fibo {
    // Write a program to print Fibonacci Series up to count 10
    public static void main(String[] args) {
        int count = 10;
        int a = 0, b = 1, c = 0;

        System.out.print(a+" "+b);
        for (int i =2;i<count;i++)
        {
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b=c;

        }

    }
}
