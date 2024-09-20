package src.sept18;

public class pallindrome02 {
    public static void main(String[] args) {
        String s = "qwertytreQ";
        String copy = s, rev = "";
        for (int i =s.length()-1;i>=0;i--)
        {
          rev =  rev + s.charAt(i);
        }
        if (rev.equalsIgnoreCase(copy))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}
