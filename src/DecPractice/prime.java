package src.DecPractice;

public class prime {
    public static void main(String[] args) {
        int num = 11;
        boolean prime = true;

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
            System.out.println(num + " is Prime Number");
        }
        else
        {
            System.out.println(num+ " is not Prime Number");
        }

    }
}
