package src.Practice;

public class primeNotPrime {
    public static void main(String[] args) {
        int num = 4;
        boolean prime = true;
            for (int i =2;i<num;i++)
            {
                if (num%i==0)
                {
                    prime = false;
                    break;
                }

            }
            if(prime)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }

    }
}
