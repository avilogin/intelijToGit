package src.SeptPractice.sept12;

public class revString {
    // How to reverse a String in Java
    public static void main(String[] args) {
        String str = "Hurray";
        String rev = "";
        for (int i = str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
