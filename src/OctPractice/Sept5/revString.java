package src.OctPractice.Sept5;

public class revString {
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println("Original String - "+str);
        String copy = str,rev = "";
        for (int i =str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse String - "+rev);
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
