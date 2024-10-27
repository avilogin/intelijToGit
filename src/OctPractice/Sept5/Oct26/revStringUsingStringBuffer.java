package src.OctPractice.Sept5.Oct26;

public class revStringUsingStringBuffer {
    public static void main(String[] args) {
        String str =  "Madama";

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println(str+" is pallindrome");
        else
            System.out.println(str+ " is not pallindrome");
    }
}
