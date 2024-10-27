package src.OctPractice.Sept5.Oct26;

public class charInStringComparission {
    public static void main(String[] args) {
        String first = "Avijeet";
        String second = "aviJeet";

        for (int i = 0;i<first.length();i++)
        {
            if (first.charAt(i)==second.charAt(i))
            {
                System.out.println(first.charAt(i)+" is equal to "+second.charAt(i));
            }
            else
            {
                System.out.println(first.charAt(i)+" is not equal to "+second.charAt(i));
            }
        }
    }
}
