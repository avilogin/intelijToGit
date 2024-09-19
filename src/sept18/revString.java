package src.sept18;

public class revString {
    public static void main(String[] args) {
        String a =  "Avijeet";
        String rev = "";
        for (int i = a.length()-1;i>=0;i--)
        {
            rev = rev+a.charAt(i);
        }
        System.out.println(rev);
    }
}
