package src.OctPractice.Sept5.Oct26;

public class reverseString {
    public static void main(String[] args) {
        String str = "Avijeet", rev = "";
        System.out.println("Original String = "+str);
        for (int i =str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);

        }
        System.out.println("Reverse String = "+rev);
    }
}
