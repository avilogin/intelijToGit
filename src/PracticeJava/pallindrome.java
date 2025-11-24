package src.PracticeJava;

public class pallindrome {
    public static void main(String[] args) {
        String origStr = "Racecar";
        String str = origStr.toLowerCase();
        String cpy = str;
        String rev = "";
        for (int i =str.length()-1;i>=0;i--)
        {
           rev = rev+str.charAt(i) ;
        }
        if (str.equalsIgnoreCase(cpy))
        {
            System.out.println(cpy+ " is a Pallindrome");
        }
        else
        {
            System.out.println(cpy +" is not a Pallindrome");
        }
    }
}
