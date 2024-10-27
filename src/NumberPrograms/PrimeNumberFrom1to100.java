package src.NumberPrograms;

public class PrimeNumberFrom1to100 {
    public static void main(String[] args) {
        int i =0,num=0;
        String prime = "";

        for ( i=1;i<=100;i++)
        {
            int count = 0;
            for (num =i;num>=1;num--)
            {
                if (i%num==0)
                {
                    count = count+1;
                }
            }
            if (count==2)
            {
                prime = prime+ i+" ";
            }

        }
        System.out.println("Prime Numbers are");
        System.out.println(prime);
    }
}
