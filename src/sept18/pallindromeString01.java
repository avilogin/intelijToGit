package src.sept18;

public class pallindromeString01 {
    public static void main(String[] args) {
        String a = "Qwertrewq";
        String copy = a;
        StringBuffer sb =  new StringBuffer(a);
        String rev = sb.reverse().toString();
        if (copy.equalsIgnoreCase(rev))
        {
            System.out.println("Pallindrome");
        }
        else
            System.out.println("Not Pallindrome");
    }
}
