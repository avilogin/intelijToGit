package src.sept12;

public class prime {
    //Prime numbers from 1 to 100
    public static void main(String[] args) {
        int num = 0;
        String prime= "";
        for(int i =1;i<=100;i++)
        {
            int count = 0;
            for(num = i;num>=1;num--)
            {

                if(i%num==0)
                {
                    count = count + 1;
                }
            }
            if(count ==2)
            {
               prime = prime + i + " ";
            }
        }
        System.out.println("Prime numbaers are ");
        System.out.println(prime);

    }
}
