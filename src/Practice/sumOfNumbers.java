package src.Practice;

public class sumOfNumbers {
    public static void main(String[] args) {
        int num = 123;
        int rem, sum = 0;
        while (num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;

        }
        System.out.println(sum);
    }
}
