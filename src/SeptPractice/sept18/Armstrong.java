package src.SeptPractice.sept18;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153, copy = num;
        double count = 0,digit = 0,sum = 0;

        while (num!=0)
        {
            num = num/10;
            count++;
        }
        System.out.println(count);
        num = copy;

        while (num!=0)
        {
         digit = num%10;
         sum = sum+Math.pow(digit,count);
         num = num/10;
        }

        if (sum==copy)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
