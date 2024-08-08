package src.Practice;

public class palliString {
    public static void main(String[] args) {
        String  st = "Madama";
        String copy = st;

        StringBuffer sb = new StringBuffer(st);
        String rev = sb.reverse().toString();

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
