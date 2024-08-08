package src.Practice;

public class revStrWithOutRev {
    public static void main(String[] args) {
        String str  = "Rahul";
        String rev = "", copy = str;
        for (int i =str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        if (copy.equalsIgnoreCase(rev))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }

    }
}
