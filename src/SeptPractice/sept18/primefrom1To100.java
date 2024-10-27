package src.SeptPractice.sept18;

public class primefrom1To100 {
    public static void main(String[] args) {
        int num = 0;
        String prime = "";
        for (int i =1;i<=100;i++)
        {
            int count = 0;
            for (num = i;num>=1;num--)
            {
                if (i%num==0)
                {
                    count++;

                }
            }
            if (count ==2)
            {
               prime = prime + i + " ";
            }

        }
        System.out.println(prime);
    }
}
