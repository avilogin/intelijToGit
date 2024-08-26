package src.StringPrograms;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String s1 = "abcd";

        String s2 = "efch";

        for (int i=0;i<s1.length();i++)
        {
            if (s1.charAt(i)==s2.charAt(i))
            {
                System.out.println(s1.charAt(i)+" is same with "+s2.charAt(i));
            }
            else
            {
                System.out.println(s1.charAt(i)+" is not same with "+s2.charAt(i));
            }
        }
    }
}
