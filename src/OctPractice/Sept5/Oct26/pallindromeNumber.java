package src.OctPractice.Sept5.Oct26;

public class pallindromeNumber {
    public static void main(String[] args) {
        int num = 12321, copy = num;
        int rem = 0, sum = 0;
        while (num>0)
        {
            rem = num%10;
            sum = (sum*10)+rem;
            num =  num/10;

        }
        if (sum==copy)
        {
            System.out.println(sum+" is pallindrome");
        }
        else
        {
            System.out.println(sum+" is not pallindrome");
        }

    }
}
