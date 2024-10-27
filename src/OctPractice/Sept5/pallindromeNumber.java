package src.OctPractice.Sept5;

public class pallindromeNumber {
    public static void main(String[] args) {
        int num = -12321,temp = num,rem = 0, sum = 0;

        while (num!=0)
        {
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }


        if (sum==temp)
        {
            System.out.println(sum+" is Pallindrome");
        }
        else
        {
            System.out.println(sum+" is  Not Pallindrome");
        }
    }

}
