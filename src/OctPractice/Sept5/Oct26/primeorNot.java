package src.OctPractice.Sept5.Oct26;

public class primeorNot {
    public static void main(String[] args) {
        int num = 11;
        boolean prime = true;

        if (num<0)
        {
            System.out.println("Number is negative. Provide another Number");
        }
        else if (num==0)
        {
            System.out.println("Number is zero. Provide another NUmber");
        }
        else if (num>0)
        {
            for (int i =2;i<num;i++)
            {
                if (num%i==0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                System.out.println(num+" is Prime");
            }
            else
            {
                System.out.println(num+" is not Prime");
            }
        }

    }
}
