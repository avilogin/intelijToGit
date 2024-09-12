package src.sept12;

public class oddOrEven {
    //odd or even from 1 to 100
    public static void main(String[] args) {
        String odd = "";
        String even = "";

        for (int i =1;i<=100;i++)
        {
            if(i%2==0)
            {
                even = even + i + " ";
            }
            else
            {
                odd = odd + i + " ";
            }
        }
        System.out .println("Odd Numbers are: "+odd);
        System.out.println("Even Numbers are: "+even);

    }
}
