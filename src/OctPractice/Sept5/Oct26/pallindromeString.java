package src.OctPractice.Sept5.Oct26;

public class pallindromeString {
    public static void main(String[] args) {
        String str = "Madam", copy = str;
        String rev ="";
        for (int i =str.length()-1;i>=0;i--)
        {
            rev =  rev+str.charAt(i);
        }
        if (rev.equalsIgnoreCase(copy))
        {
            System.out.println(copy+" is Palindrome String");
        }
        else
        {
            System.out.println(copy+" is not a Palindrome String");
        }

    }
}
