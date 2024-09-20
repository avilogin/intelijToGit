package src.sept18;

public class fact {
    public static void main(String[] args) {
        long num = 20, fact = 1;
        for (int i =1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
